package Piaskownica;

import java.util.HashMap;
import java.util.Map;

public class Dznnnk {

    private Map<String, Stdnt> studenci = new HashMap<>();

    public void dodajStudenta(Stdnt stdnt){
        studenci.put(stdnt.getNrInd(),stdnt);
    }
    public void usunStudenta(Stdnt stdnt){
        studenci.remove(stdnt.getNrInd(), stdnt);
    }
    public void usunStuNrIndx(String index){
        studenci.remove(index);
    }

    @Override
    public String toString() {
        return "Dznnnk{" +
                "studenci=" + studenci +
                '}';
    }
}
