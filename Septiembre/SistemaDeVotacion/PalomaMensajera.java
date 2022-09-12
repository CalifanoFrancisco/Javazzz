public class PalomaMensajera extends Pajaro implements Enviador{
      
      public PalomaMensajera() {
            super();
      }

      @Override
      public void hacerCampania(String msg){
            if(this.getprendioElMapaParaVolarSola() == true){
                  System.out.println("Lanzando un papelito que dice:" + msg);
            }
      }
}
