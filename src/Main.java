public class Main {
    public static void main(String[] args) {

//        Продолжаем тему книг и пишем свой небольшой библиотечный справочник, где хранится информация о книгах.
//        - Отладочная информация
//        Какой бы из уровней вы ни сделали, рекомендуется создать отдельный класс, например с именем Main или App,
//        в нем объявить метод main и в нем протестировать работу вашего кода.
//        В случае с простым уровнем нужно создать несколько книг и авторов (по два, например).
//
//        1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
//        Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
//        2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
//        3. Написать конструкторы для обоих классов, заполняющие все поля.
//        4. Создать геттеры для всех полей автора и всех полей книги.
//        5. Создать сеттер для поля «Год публикации» у книги.
//        6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор
//        (достаточно тоже двух) и инициализировать друг друга. Учесть, что авторы являются обязательными
//        членами книг и книги не могут создаться без авторов.
//        Метод main не должен находиться в классах Book и Author.
//        Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.//
//        7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
//              -- Критерии оценки --
//        1. Классы созданы корректно.
//        2. Поля созданы корректно. Использованы корректные имена и типы.
//        3. Классы корректно создаются через конструктор.
//        4. Классы имеют все необходимые геттеры и сеттеры.
//        5. Объекты в методе main созданы.

        Author author1 = new Author("Elena", "Rezanova");
        Author author2 = new Author("Roger", "Seip");

        Book book1 = new Book("THIS IS NORMAL!", author1, 2020);
        Book book2 = new Book("Master Your Mind", author2, 2021);

        System.out.println(book1.getNameBooK() + " - " + book1.getAuthorBook().getFirstNameAuthor() + " " + book1.getAuthorBook().getLastNameAuthor() + " - " + book1.getPublishingYear());
        System.out.println(book2.getNameBooK() + " - " + book2.getAuthorBook().getFirstNameAuthor() + " " + book2.getAuthorBook().getLastNameAuthor() + " - " + book2.getPublishingYear());

        book2.setPublishingYear(2024);
        System.out.println(book2.getNameBooK() + " - " + book2.getAuthorBook().getFirstNameAuthor() + " " + book2.getAuthorBook().getLastNameAuthor() + " - " + book2.getPublishingYear());

        System.out.println();
        System.out.println("Средний уровень");
        System.out.println();
        /*
1. Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
2. Написать статические методы для работы с массивом в классе, где располагается метод main:
    1. Добавить книгу (найти свободную ячейку массива и положить туда книгу).
    Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна успешно
    укладываться в массив.
    2. Напечатать в консоль все книги из массива в следующем формате:
        “Stephen King: The Stand: 1978”
--- Критерии оценки
    1. В методе main создан массив и заполнен созданными ранее объектами.
    2. Методы объявлены корректно.
    3. Методы корректно справляются со своей задачей.
 */

//        BOOKS[0] = new Book("THIS IS NORMAL!", new Author("Elena", "Rezanova"), 2020);
//        BOOKS[1] = new Book("Master Your Mind", new Author("Roger", "Seip"), 2021);
//        addBook(new Book("The Stand", new Author("Stephen", "King"), 1978));
//        printBook();

        System.out.println();
        System.out.println("Сложный уровень");
        System.out.println();
        /*
1. Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
   Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют.
   Работать с массивом можно только через внутренние нестатические методы класса Library.
2. Конструктор класса должен получать в качестве параметра размер массива и
   инициализировать в себе поле массива тем размером, что пришел параметром.
3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
4. Создать новые нестатические методы в классе Library:
    1. Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
       Формат: “The Stand by Stephen King was published in 1978”
    2. Изменить год публикации книги по ее названию.
       В метод подаются два параметра, а именно: название и новый год публикации.
       Нужно найти книгу и изменить ее год публикации.
--- Критерии оценки
    1. Класс Library создан корректно.
    2. Массив корректно перенесен в виде поля в класс Library.
    3. Конструктор класса Library написан корректно.
    4. Корректно перенесены методы, модификатор static удален.
    5. Объявлены новые методы.
    6. Методы корректно справляются со своей задачей.
         */
        Library library = new Library(5);

        library.addBook(new Book("THIS IS NORMAL!", author1, 2020));
        library.addBook(new Book("Master Your Mind", author2, 2021));
        library.addBook(new Book("The Stand", new Author("Stephen", "King"), 1978));

        library.printInformationAboutBook("THIS IS NORMAL!");
        System.out.println();

        library.changePublicationYear("Master Your Mind", 2023);
        library.printBook();
    }

    //    Методы для среднего уровня
//
//    private static final Book[] BOOKS = new Book[5];
//
//    private static void addBook(Book book) {
//        for (int i = 0; i < BOOKS.length; i++) {
//            if (BOOKS[i] == null) {
//                BOOKS[i] = book;
//                break;
//            }
//        }
//    }
//
//    private static void printBook() {
//        for (Book book : BOOKS) {
//            if (book != null) {
//                System.out.println(book.getAuthorBook().getFullNameAuthor() + ": " + book.getNameBooK() + ": " + book.getPublishingYear());
//            }
//        }
//    }
}