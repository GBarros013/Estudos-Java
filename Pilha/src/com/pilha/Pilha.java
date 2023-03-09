package com.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    public No pop(){
        if (!this.isEmpty()){
            No noPopep = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPopep;
        }
        return null;
    }
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public No top(){
        return refNoEntradaPilha;
    }
    public boolean isEmpty(){
        if (refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String stringRetorno = "______________________\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "______________________\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else {
                break;
            }
        }
        stringRetorno += "______________________\n";
        return stringRetorno;
    }
}
