# TravelOffice


UMIEJĘTNOŚCI:

• Wykonując to ćwiczenie rozpoczniesz budowanie systemu dla biura wycieczkowego. Na początek
zbudujesz kilka podstawowych klas, obecnych w większości tego typu systemów i przy okazji podniesiesz
swoje umiejętności w posługiwaniu się klasami i obiektami.


CELE I ZADANIA:

• Funkcjonalność wypisującą wartość obiektu klasy Date umieść w jednej z jej metod – możesz też
wykorzystać klasę z poprzedniego ćwiczenia.

• Utwórz klasy, które będą stanowiły podstawę dla systemu obsługi wycieczek. W systemie powinny
znaleźć się klasy reprezentujące:

– wycieczkę — początek i koniec wycieczki oraz jej opis

– adres – adres klienta zawierający ulicę, kod pocztowy i miejscowość

– klienta -– dane osobowe klienta i jego adres

– biuro wycieczkowe — obsługa wycieczek i klientów

• Do każdej zaimplementowanej klasy dodaj metodę wypisującą wartość jej obiektów.


ALGORYTM WYKONANIA:

• Wykorzystaj klasę Date z poprzedniego ćwiczenia do reprezentacji daty rozpoczęcia wycieczki i jej
zakończenia

• Utwórz następujące klasy:

– Trip – z atrybutami start i end typu Date oraz destination typu String

∗ w klasie Trip utwórz konstruktor przyjmujący wszystkie trzy wartości i przypisujący je do
atrybutów klasy

∗ utwórz metodę getInfo zwracającą wartość typu String opisującą zawartość obiektu. Skorzystaj
z metody getInfo obiektu Date do pobrania wartości dat

– Address – z atrybutami street, zip i city typu String

∗ poprzez konstruktor należy zapisać w atrybutach klasy dane adresowe

∗ utwórz metodę getInfo zwracającą wartość typu String, opisującą zawartość obiektu.

– Customer – z atrybutami name typu String, address typu Address oraz trip typu Trip

∗ konstruktor przypisuje wartość atrybutu name

∗ utwórz metodę setAddress do przypisania wartości adresu

∗ utwórz metodę assignTrip przypisującą wycieczkę

∗ utwórz metodę getInfo zwracającą wartość typu String, opisującą zawartość obiektu. Skorzystaj
z metody getInfo obiektu Trip oraz Address

– TravelOffice – w której metoda main:

∗ tworzy obiekt typu Address

∗ tworzy obiekt typu Customer

∗ tworzy obiekt typu Trip

∗ przypisuje wycieczkę klientowi

∗ wyświetla informację o kliencie korzystając z metody getInfo klasy Customer