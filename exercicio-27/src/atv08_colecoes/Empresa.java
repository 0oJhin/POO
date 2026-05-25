package atv08_colecoes;
import java.util.TreeMap;

import java.util.Map;

public class Empresa {
    private TreeMap<Integer, Funcionario> funcionarios;
    public Empresa(){
        funcionarios = new TreeMap<>();
    }

public void adicionarFuncionario(Integer codigo, Funcionario funcionario){
        funcionarios.put(codigo,funcionario);
        System.out.println("Funcionario adicionado codigo : "+ codigo +" | "+ funcionario.getNome());
}
public void buscarFuncionario(Integer codigo){
     System.out.println("Busca feita Codigo: "+ codigo +" | "+ funcionarios.get(codigo));
}
public void removerFuncionario(Integer codigo){
    System.out.println("Funcionario removido : "+ codigo +" | "+ funcionarios.get(codigo));
    funcionarios.remove(codigo);
}
public void verificarCodigo(Integer codigo){
    if(funcionarios.containsKey(codigo)){
        System.out.println("Funcionario existe "+ codigo+ " | " + funcionarios.get(codigo));
    }else{
        System.out.println("Funcionario nao exite ");
    }
}
public void listarFuncionarios(){
    System.out.println("Listagem de funcionarios atual");
    for(Map.Entry<Integer, Funcionario> funcionario : funcionarios.entrySet()){
        System.out.println("Codigo: " + funcionario.getKey() +" | " + funcionario.getValue());
    }
    System.out.println("Fim da listagem de funcionarios");
}
public void mostrarPrimeiraChave(){
    System.out.println("Primeiro funcionario-> "+ funcionarios.firstKey());
}
public void mostrarUltimaChave(){

    System.out.println("Ultimo funcionario-> "+ funcionarios.lastKey());
}
public void mostrarQuantidade(){
   System.out.println("Quantidade -> "+ funcionarios.size()+" Funcionarios");

}
public void verificarEmpresaVazia(){    
    if(funcionarios.isEmpty()){
        System.out.println("Empresa vazia");
    }else{
        System.out.println("Empresa ainda possui funcionarios, quantidade: "+funcionarios.size());
        
    }
}
}