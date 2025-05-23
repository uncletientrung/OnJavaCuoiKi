
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class nhatkyBUS {
    private nhaykyDAO nkDAO=new nhaykyDAO();
    private ArrayList<nhatkyDTO> list_nk;
    public nhatkyBUS(){
        list_nk=nkDAO.selectAll();
    }
    public ArrayList<nhatkyDTO> getListNK(){
        return list_nk;
    }
    
    public Boolean Them(nhatkyDTO nknew){
        for(nhatkyDTO nk: list_nk){
            if(nk.getId() == nknew.getId()){
                return false;
            }
        }
        Boolean result= nkDAO.Insert(nknew) !=0;
        if(result){
            list_nk.add(nknew);
        }
        return result;
    }
    
    public double tongtien(){
        double result=0;
        for(nhatkyDTO nk: list_nk){
            result+=nk.getSotien();
        }
        return result;
    }
}
