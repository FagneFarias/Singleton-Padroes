/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosingleton;

/**
 *
 * @author fagne
 */
public class contato{
    
    private static String nomeContato;
    private static String apelido;
    private static int DDD;
    private static int numeroTelefone;
    private static String email;
    private static String anotacao;
    private static contato uniqueInstance;

//    public Contato() {}

    private contato(String nomeContato, String apelido, int DDD, int numeroTelefone, String email, String anotacao) {
        contato.nomeContato = nomeContato;
        contato.apelido = apelido;
        contato.DDD = DDD;
        contato.numeroTelefone = numeroTelefone;
        contato.email = email;
        contato.anotacao = anotacao;
    }
    public synchronized static contato obterContato(){
        if(uniqueInstance == null){
            uniqueInstance = new contato(nomeContato, apelido, DDD, numeroTelefone, email, anotacao);
        }
        return uniqueInstance;
    }
    
    public static void main (String[] args){
        contato fagne = contato.obterContato();
        contato amanda = contato.obterContato();
        System.out.print("\n"+fagne);
        System.out.print("\n"+amanda);
    }
}
   