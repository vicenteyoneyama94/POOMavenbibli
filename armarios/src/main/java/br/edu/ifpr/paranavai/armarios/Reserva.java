package br.edu.ifpr.paranavai.armarios;

import java.util.Date;

public class Reserva {
    private Pessoa pessoa;
    private Armario armario;
    private Date dataHoraDevolucao;
    private Date dataHoraEmprestimo;
    
    public Reserva(){
    
    }
    public Reserva(Pessoa pessoa, Armario armario,
            Date dataHoraDevolucao, Date dataHoraEmprestimo){
        this.pessoa = pessoa;
        this.armario = armario;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
        this.dataHoraDevolucao = dataHoraDevolucao;
        
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public Date getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Date getDataHoraEmprestimo() {
        return dataHoraEmprestimo;
    }

    public void setDataHoraEmprestimo(Date dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
}
