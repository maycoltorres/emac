
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class leerArchivos {

    public leerArchivos(File fileName) {
        List cellData = new ArrayList();
        
        try {
            FileInputStream  fileInputStream = new FileInputStream(fileName);
            XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
            XSSFSheet hssfSheet = workBook.getSheetAt(0);
            Iterator rowIterator = hssfSheet.rowIterator();
            
            while(rowIterator.hasNext()){
               XSSFRow hssfRow = (XSSFRow) rowIterator.next();
               Iterator iterator = hssfRow.cellIterator();
               List cellTemp = new ArrayList();
               while (iterator.hasNext()){
                   XSSFCell hssfCell = (XSSFCell) iterator.next();
                   cellTemp.add(hssfCell);
               }
               cellData.add(cellTemp);
            }
            
        } catch (Exception e) {
        }
        obtener(cellData);
    }
    private void obtener(List cellDataList){
        for(int i = 0; i < cellDataList.size(); i++){
            List cellTempList = (List) cellDataList.get(i);
            for(int j = 0; j < cellTempList.size(); j++){
               XSSFCell  hssfCell = (XSSFCell) cellTempList.get(j);
               String stringCellValue = hssfCell.toString();
                System.out.println(stringCellValue+" ");
            }
            
            System.out.println();
            
        }
    }
}
