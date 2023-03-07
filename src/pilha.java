import javax.swing.JOptionPane;

public class pilha {
    
    public static void main(String[] args) throws Exception {

        // Atividade 04 - Pilha usando vetor
        // Implemente a classe Pilha com os seguintes atributos e métodos:
        // - Atributos: int vet[], int topo, int tamanho
        // - Métodos: void empilhar(int), void desempilhar(), int topo(), boolean vazia(), boolean cheia(), int tamanho()
        // teste sua classe e todas suas funcionalidades !
         
        int topo=0;
        int tamanho;

        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho da pilha:"));
        System.out.println(tamanho);

        int vet[] = new int[tamanho];

        // for(int i=0; i<tamanho;i++){
        //     System.out.println(i);
        // }

        pilha.empilhar(topo);


    }

    public static void empilhar(int topo) {
        if(pilha.cheia() == true){

        }
    }

    public void desempilhar() {
        
    }

    public int topo() {
        return 0;
    }

    public boolean vazia() {
        return true;
    }

    public static boolean cheia() {
        return true;
    }

    public int tamanho() {
        return 0;
    }

}
