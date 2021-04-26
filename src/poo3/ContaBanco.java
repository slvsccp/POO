package poo3;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //CONSTRUTOR
    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
    
    //GET E SET
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo() {
        return tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return status;
    }

    //MÉTODOS
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        
        if(t == "CC"){
        setSaldo(50);
        } else if(t == "CP"){
        setSaldo(150);
    }
        
    }
    public void fecharConta() {
        if(saldo > 0){
            System.out.println("Conta com dinheiro, conta não pode ser fechada.");
        } else if(saldo < 0){
            System.out.println("Conta em débito.");
        } else{
            setStatus(false);
        }
    }
    public void depositar(float v) {
        if(status == true){
            saldo = saldo + v;
        } else {
            System.out.println("Impossível depositar");
        }
    }
    public void sacar(float v) {
        if(status == true){
            if(saldo > v){
                saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensal() {
        float v = 0;
        if(tipo == "CC"){
            v = 12;
        } else if(tipo == "CP") {
            v = 20;
        }
        
        if(status == true){
            if(saldo > v){
                saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }
    
}
