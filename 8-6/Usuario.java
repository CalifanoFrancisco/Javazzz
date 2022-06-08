public class Usuario {
    private String userName;
    private String clave;
    public Usuario(){
        this.userName="e";
    }
    public Usuario(String userName,String clave){
        this.userName = userName;
        this.clave = clave;
    }
    public String getUserName(){    return this.userName;   }
    public String getClave(){       return this.clave;      }
    public void setUserName(String e){      this.userName=e; }
    public void setClave(String e){         this.clave=e;   }
}
