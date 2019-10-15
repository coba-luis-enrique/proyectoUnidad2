
package proyectounidad2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTC extends AbstractTableModel{
    public String [] columnas = {"Semilla", "Semilla al cuadrado", "Aleatorio"};
    public Class [] tipo = {Integer.class,Integer.class,Double.class};
    private ArrayList <CentrosCuadrados> oper;

    public ModeloTC(ArrayList<CentrosCuadrados> oper) {
        this.oper = oper;
    }

  
    
    public void add(CentrosCuadrados data){
        oper.add(data);
        fireTableRowsInserted(oper.size() - 1, oper.size() - 1 );
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return this.oper.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int f, int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return this.tipo[columnIndex]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
    

