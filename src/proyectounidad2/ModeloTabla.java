
package proyectounidad2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabla extends AbstractTableModel {
    public String [] columnas = {"Semilla","Operacion", "Random"};
    public Class [] tipos = {Integer.class,Integer.class,Double.class};
    private ArrayList<csFilaTabla> filas;

    public ModeloTabla(ArrayList<csFilaTabla> filas) {
        this.filas = filas;
    }

  
    
   

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.filas.size();
    
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        csFilaTabla obj = this.filas.get(f);
        switch(c){
            case 0: return obj.getSemilla();
            case 1: return obj.getOperacion();
            case 2: return obj.getRandom();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return this.tipos[i];
    // return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
        //return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
