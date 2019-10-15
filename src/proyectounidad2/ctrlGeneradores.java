
package proyectounidad2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ctrlGeneradores {
    private csMetodoCongruencia objmc;
    private CentrosCuadrados obj;
    public ArrayList<csFilaTabla> list = new ArrayList<csFilaTabla>();
    
    
    
    private int iteraciones, contador = 0;

    public CentrosCuadrados getObj() {
        return obj;
    }

    public void setObj(CentrosCuadrados obj) {
        this.obj = obj;
    }
    

    public csMetodoCongruencia getObjmc() {
        return objmc;
    }

    public void setObjmc(csMetodoCongruencia objmc) {
        this.objmc = objmc;
    }
    
    public csFilaTabla Generar()
    {
       int r=( this.objmc.getA()*this.objmc.getSemilla()+
               objmc.getC()) % this.objmc.getM();
       System.out.println(r);
       
       csFilaTabla fila = new csFilaTabla();
       
       fila.setSemilla(this.objmc.getSemilla());
       
       fila.setOperacion(r);
       fila.setNumero(objmc.getM());
       
       
       
       fila.setRandom(fila.getOperacion()/fila.getNumero());
       this.list.add(fila);
       return fila;
    }

    public  DefaultTableModel Operacion( )
    {
        int index,s, e,r;
       String cade;
       String[] valores = new String[5];
       iteraciones = obj.getNumeros();
       DefaultTableModel mde = new DefaultTableModel();
        while(contador > iteraciones){
         
            s=  this.obj.getSemilla();
            e = s*s;
            valores[0] = "" +(contador +1);
            valores[1] = "" +s;
            valores[2] = "" + e;
            cade= Integer.toString(e);
            r = Integer.parseInt(cade.substring(2, 4));
            valores[3] = "" +r;
            
            
            mde.addRow(valores);
            contador++;

        }
        
        
        
        return mde;
    }

   
    
}
