/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_model;

import java.util.logging.Level;
import java.util.logging.Logger;
import system_persistence.Database;
import static system_persistence.Database.MAX;
import system_model.Tecnico;

/**
 *
 * @author maayk
 */
public class Departamento {

    private String codigo;
    private String nome;
    private Funcionario f[];
    private int countFunc;
    private double totalspend;
    private static Database database;

    public Departamento(String code, String name) {
        this.codigo = code;
        this.nome = name;
        this.countFunc = 0;
        f = new Funcionario[MAX];
        this.totalspend = 0;
    }

    public void addEfetivo(String area, String nome, String codigo, String nivel, String titulacao) {
        Efetivo e = new Efetivo(area, nome, codigo, nivel, titulacao);
        database.addFunctionaries(e);
        f[countFunc] = e;
        countFunc++;
        this.totalspend = totalspend + e.calcularSalario(nivel);

    }

    public void addSubstituto(int cargahoraria, String area, String nome, String codigo, double salario, String nivel, String titulacao) {
        Substituto s = new Substituto(cargahoraria, area, nome, codigo, nivel, titulacao);
        database.addFunctionaries(s);
        f[countFunc] = s;
        countFunc++;
        this.totalspend = totalspend + s.calcularSalario(nivel);
    }

    public void addTecnico(String funcao, String nome, String codigo, double salario, String nivel) {
        Tecnico t = new Tecnico(funcao, nome, codigo, nivel);
        database.addFunctionaries(t);
        f[countFunc] = t;
        countFunc++;
        this.totalspend = totalspend + t.calcularSalario(nivel);
    }

    public String showAllFunc() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            data = data
                    + "Nome: " + vet[i].getNome() + "/n"
                    + "Codigo: " + vet[i].getCodigo() + "/n"
                    + "Salario: " + vet[i].getSalario() + "/n"
                    + "Nivel: " + vet[i].getNivel() + "/n";
        }
        return data;
    }

    public String showAllTec() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Tecnico) {
                data = data
                        + "Nome: " + vet[i].getNome() + "/n"
                        + "Codigo: " + vet[i].getCodigo() + "/n"
                        + "Salario: " + vet[i].getSalario() + "/n"
                        + "Nivel: " + vet[i].getNivel() + "/n";
            }
        }
        return data;
    }

    public String showAllDocentes() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Substituto) {
                data = data
                        + "Nome: " + vet[i].getNome() + "/n"
                        + "Codigo: " + vet[i].getCodigo() + "/n"
                        + "Salario: " + vet[i].getSalario() + "/n"
                        + "Nivel: " + vet[i].getNivel() + "/n"
                        + "Titulação: " + vet[i].s.getTitulacao() + "/n"
                        + "Carga horária: " + vet[i].s.getCargahoraria() + "/n";

            } else if (vet[i] instanceof Efetivo) {
                data = data
                        + "Nome: " + vet[i].getNome() + "/n"
                        + "Codigo: " + vet[i].getCodigo() + "/n"
                        + "Salario: " + vet[i].getSalario() + "/n"
                        + "Nivel: " + vet[i].getNivel() + "/n"
                        + "Titulação: " + vet[i].e.getTitulacao() + "/n"
                        + "Área: " + vet[i].e.getArea() + "/n";

            }
        }
        return data;
    }

    public String showAllSubs() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Substituto) {
                data = data
                        + "Nome: " + vet[i].getNome() + "/n"
                        + "Codigo: " + vet[i].getCodigo() + "/n"
                        + "Salario: " + vet[i].getSalario() + "/n"
                        + "Nivel: " + vet[i].getNivel() + "/n"
                        + "Carga Horária: " + vet[i].s.getCargahoraria() + "/n";
            }
        }
        return data;
    }

    public String showAllEfetivo() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Efetivo) {
                data = data
                        + "Nome: " + vet[i].getNome() + "/n"
                        + "Codigo: " + vet[i].getCodigo() + "/n"
                        + "Salario: " + vet[i].getSalario() + "/n"
                        + "Nivel: " + vet[i].getNivel() + "/n"
                        + "Área: " + vet[i].e.getArea() + "/n";
            }
        }
        return data;
    }

    public String showFuncSalarioEspec(double de, double ate) throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].salario >= de && vet[i].salario <= ate) {
                data = data
                        + "Nome: " + vet[i].getNome() + "/n"
                        + "Codigo: " + vet[i].getCodigo() + "/n"
                        + "Salario: " + vet[i].getSalario() + "/n"
                        + "Nivel: " + vet[i].getNivel() + "/n";
            }
        }
        return data;
    }

    public String showInfoDepartamento(String code) throws CloneNotSupportedException {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getCodigo().equals(code)) {
                for (int j = 0; j < vet[i].f.length; j++) {
                    if (j == (vet[i].f.length) - 1) {
                        data = data
                                + "Nome: " + vet[i].f[j].nome + "/n"
                                + "Codigo: " + vet[i].f[j].codigo + "/n"
                                + "Salario: " + vet[i].f[j].salario + "/n"
                                + "Nivel: " + vet[i].f[j].nivel + "/n"
                                + "Gastos totais: " + vet[i].totalspend + "/n";
                        return data;
                    }
                    data = data
                            + "Nome: " + vet[i].f[j].nome + "/n"
                            + "Codigo: " + vet[i].f[j].codigo + "/n"
                            + "Salario: " + vet[i].f[j].salario + "/n"
                            + "Nivel: " + vet[i].f[j].nivel + "/n";

                }
            }
        }
        return data;
    }

    public String showGeneralDep() throws CloneNotSupportedException {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            data = data
                    + "Departamento: " + vet[i].nome + "/n"
                    + "Codigo: " + vet[i].codigo + "/n"
                    + "Quantidade de Funcionários: " + vet[i].f.length + "/n"
                    + "Gastos totais: " + vet[i].totalspend + "/n";
            for (int j = 0; j < vet[i].f.length; j++) {
                if (j == (vet[i].f.length) - 1) {
                    data = data
                            + "Nome: " + vet[i].f[j].nome + "/n"
                            + "Codigo: " + vet[i].f[j].codigo + "/n"
                            + "Salario: " + vet[i].f[j].salario + "/n"
                            + "Nivel: " + vet[i].f[j].nivel + "/n"
                            + "Gastos totais: " + vet[i].totalspend + "/n";
                    return data;
                }
                data = data
                        + "Nome: " + vet[i].f[j].nome + "/n"
                        + "Codigo: " + vet[i].f[j].codigo + "/n"
                        + "Salario: " + vet[i].f[j].salario + "/n"
                        + "Nivel: " + vet[i].f[j].nivel + "/n";

            }
        }

        return data;
    }

    public String showInfoDepartamentoFaixaEspecifica(double de, double ate) throws CloneNotSupportedException {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].totalspend >= de && vet[i].totalspend <= ate) {
                data = data
                        + "Departamento: " + vet[i].nome + "/n"
                        + "Codigo: " + vet[i].codigo + "/n"
                        + "Quantidade de Funcionários: " + vet[i].f.length + "/n"
                        + "Gastos totais: " + vet[i].totalspend + "/n";
            }
        }
        return data;
    }

    public String showInfoDepartamentos(double de, double ate) throws CloneNotSupportedException {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            data = data
                    + "Departamento: " + vet[i].nome + "/n"
                    + "Codigo: " + vet[i].codigo + "/n"
                    + "Quantidade de Funcionários: " + vet[i].f.length + "/n"
                    + "Gastos totais: " + vet[i].totalspend + "/n";

        }
        return data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Departamento clone() throws CloneNotSupportedException {
        try {
            return (Departamento) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}