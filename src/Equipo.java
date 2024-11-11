import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private List<Jugador> listado;

    public Equipo(){
        listado=new ArrayList<Jugador>();
        try {
            predefinir();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean buscarJugadorId(int codigo){
        boolean encontrado=false;
        for(Jugador x:listado){
            if(x.getCodigo()==codigo){
                encontrado=true;
                return encontrado;
            }
        }
        return encontrado;

    }

    public boolean agregarJugador(Jugador nuevo) throws Exception{

         if(buscarJugadorId(nuevo.getCodigo())==true){
             throw new Exception("El id ya existe");
         }else{
             listado.add(nuevo);
             return true;
         }

    }

    public void predefinir() throws Exception{
        agregarJugador(new Jugador(1,"Pepe",70.40f,"Delantero",5245.4f));
        agregarJugador(new Jugador(2,"Ana",28.90f,"Defensa",5245.4f));
        agregarJugador(new Jugador(3,"Martha",39.99f,"Defensa",5245.4f));
        agregarJugador(new Jugador(4,"Jair",60.41f,"Delantero",5245.4f));

    }


    public void actualizarSueldo(String posicion, float nuevoSueldo){

        for(Jugador j:listado){
            if(j.getPosicion().compareToIgnoreCase(posicion)==0){
                j.setSueldo(nuevoSueldo);
            }
        }
    }


    public Jugador buscarBinario(int codigo){
        if(codigo<listado.get(0).getCodigo() || codigo>listado.getLast().getCodigo())
            return null;//no existe
        int inf=0;
        int sup= listado.size()-1;
        int centro;

        while(inf<=sup){
            centro=(inf+sup)/2;
            if(listado.get(centro).getCodigo()==codigo){
                return listado.get(centro);
            }else if(codigo>listado.get(centro).getCodigo()){
                inf=centro+1;
            }else{
                sup=centro-1;
            }
        }
        return null;
    }

    @Override
    public String toString() {
       String resultado="";
       for(Jugador j:listado){
           resultado+=j.toString();
       }
       return resultado;

    }
}
