public class lista {
    
    int tamanho; 
    String v[];

    public lista(int n){
        tamanho = n;  
        v=new String [tamanho];
    }
    
    public void adiconar(String valor){
        int k = 0;	
		for(int i=0; i < this.v.length; i++){
			if(v[i] != null){
				k += 1;
    }
    
    }
     v[k] = valor;
    }

    public int tamanho(){
        int j=0;    
        for(int i=0;i<v.length;i++){    
               if( (v[i] != null) && !(v[i].isEmpty())){    
                 j= j+1;    
               }    
          }
        return j;
    }

    public String get(int a){
           String retorno;
          if(v[a] == null){
             
            retorno = "indice invalido";
            
          }else{
            retorno = v[a];
          }
            return retorno;
    }

    public void set(int indice,String valor){
        v[indice] = valor;
       
    }

    public void limpar(){
        for(int i=0;i<v.length;i++){    
              v[i] = null;
            }    
       }
       
    


}
