package Zad4;

import java.util.*;

public class Journal {

    private Map<String, Student> studentMap = new HashMap<>();

    public void dodajStudenta(Student student){
        //umiesc w mapie studenta
        // kluczem jest indeks , wartoscia obiekt student
        studentMap.put(student.getIndeks(), student);

    }
    public void usunStudenta(Student student){
        //UWAGA parametrem jest INDEKS a nie obiekt studenta
        studentMap.remove(student.getIndeks());

    }
//usuwanie studenta po nr indexu
    public void usnStudenta(String indeks){
        studentMap.remove(indeks);

    }
    public Optional<Student> zwrocStudenta1(String indek){
        if (studentMap.containsKey(indek)){
            return Optional.ofNullable(studentMap.get(indek));
        }
        return Optional.empty();
    }

    public Student zwrocStudenta2_zle(String indeks){
        if (studentMap.containsKey(indeks)){
            return studentMap.get(indeks);
        }
        return null;
    }

    // opcjsa 2  -rzuc exception
    public Student zwrocStrudnta2 (String indeks) throws StudentNotFoundException {
        if (studentMap.containsKey(indeks)){
            return studentMap.get(indeks);
        }
        throw new StudentNotFoundException("Student with this index was not found");
    }

    public double podajSredniaStudenta(String indeks) throws StudentNotFoundException {
        double sum = 0.0;
        Student studentKtoregoSredniaLiczymy = zwrocStrudnta2(indeks);
        for (Double ocena : studentKtoregoSredniaLiczymy.getListaOcen()){
            sum += ocena;
        }
        return sum/studentKtoregoSredniaLiczymy.getListaOcen().size();
    }

    public List<Student> zwrocZagrozonych(){
        List<Student> listaWynikowa = new ArrayList<>();

        //magia
        for (String indeks : studentMap.keySet()){
            try{
                if (podajSredniaStudenta(indeks)<=2.0){
                    listaWynikowa.add(studentMap.get(indeks));
                }
            }catch (StudentNotFoundException e){
                System.out.println("Błąd nie można znaleść stidenta");
            }
        }
        return listaWynikowa;
    }

    public List<Student> zwrocPosortowanaListaStudntow(){
        //kopiuje wszystich studntow  z mapy do listy
        List<Student> studentList = new ArrayList<>(studentMap.values());

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 1 gdy o1>o2
                //0 gdy o1=02
                //-1 gdy o1<o2
                int indeks1 = Integer.parseInt(o1.getIndeks());
                int indeks2 = Integer.parseInt(o2.getIndeks());



                return Integer.compare(indeks1, indeks2);
            }
        });
        return studentList;
    }
}
