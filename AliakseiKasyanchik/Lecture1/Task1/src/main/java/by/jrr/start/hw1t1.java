package by.jrr.start;

public class hw1t1 {

    public static void main(String[] args) {
        System.out.println("1/ Объект - карандаш");
        System.out.println("Состояние : острота кончика грифеля");
        System.out.println("Поведение : рисовать"); //при использовании затупляется кончик грифеля
        System.out.println();
        System.out.println("2/ Объект - выключатель света");
        System.out.println("Состояние : вкл. выкл.");
        System.out.println("Поведение :");
        System.out.println("- включить"); //При включении начинает гореть люстра
        System.out.println("- выключить"); //При выключении люстра гаснет
        System.out.println();
        System.out.println("3/ Объект - Объект - графин с водой");
        System.out.println("Состояние : количество воды");
        System.out.println("Поведение :  налив воды в стакан"); //При использовании уменьшается количество воды
        System.out.println();
        System.out.println("4/ Объект - обогреватель");
        System.out.println("Состояние :");
        System.out.println("- вкл. выкл.");
        System.out.println("- температура корпуса");
        System.out.println("Поведение : ");
        System.out.println("- включить"); // При включении начинает повышаться температура корпуса.
        System.out.println("- выключить"); // При выключении температура корпуса снижается
        System.out.println();
        System.out.println("5/ Объект - ластик");
        System.out.println("Состояние : длина ластика");
        System.out.println("Поведение :  стирание карандаша"); //При использовании уменьшается длиналастика
        System.out.println();
        System.out.println("6/ Объект - ксерокс");
        System.out.println("Состояние :");
        System.out.println("- вкл. выкл.");
        System.out.println("- количество бумаги в лотке");
        System.out.println("- количество тонера");
        System.out.println("Поведение : ");
        System.out.println("- включить"); // При включении происходит копирование документа, уменьшение количества тонера и объема бумаги.
        System.out.println("- выключить"); // ничего не происходит
        System.out.println();
        System.out.println("7/ Объект - светофор");
        System.out.println("Состояние :");
        System.out.println("- зеленый свет - вкл./выкл./мигающий");
        System.out.println("- желтый свет - вкл./выкл./мигающий");
        System.out.println("- красный свет - вкл./выкл");
        System.out.println("- движение автомобиля"); // ничего не происходит
        System.out.println("Поведение : ");
        System.out.println("- зелевый свет (вкл.), желтый (выкл.), красный (выкл.)"); // автомобиль движется
        System.out.println("- зелевый свет (миг.), желтый (выкл.), красный (выкл.)"); // автомобиль движется или останавливается
        System.out.println("- зелевый свет (выкл.), желтый (вкл.), красный (выкл.)"); // втомобиль останавливается или стоит
        System.out.println("- зелевый свет (выкл.), желтый (выкл.), красный (вкл.)"); // автомобиль стоит
        System.out.println("- зелевый свет (выкл.), желтый (вкл.), красный (вкл.)"); // автомобиль стоит
        System.out.println("- зелевый свет (выкл.), желтый (миг.), красный (выкл.)"); // автомобиль движется в соответствии с приоритетом
        System.out.println();
        System.out.println("8/ Объект - кнопка дверного звонка");
        System.out.println("Состояние :");
        System.out.println("- вкл. /выкл.");
        System.out.println("- сигнал звонка");
        System.out.println("Поведение : ");
        System.out.println("- включить"); // Подача сигнала звонка (световали и/или звуковая).
        System.out.println("- выключить"); // ничего не происходит
        System.out.println();
        System.out.println("9/ Объект - эскалатор");
        System.out.println("Состояние :");
        System.out.println("- вкл. /выкл.");
        System.out.println("- пешеход идет/стоит");
        System.out.println("Поведение : ");
        System.out.println("- включить"); // Происходит движение эскалатора при этом пешеход стоит
        System.out.println("- выключить"); // Эскалатор не движется при этом пешеход поднимается/спускается самостоятельно
        System.out.println();
        System.out.println("10/ Объект - компрессор");
        System.out.println("Состояние :");
        System.out.println("- вкл. /выкл.");
        System.out.println("- состояние автомобильной шины");
        System.out.println("Поведение : ");
        System.out.println("- включить"); // При работе компрессора происходит накачка автомобильной шины
        System.out.println("- выключить"); // ничего не происходит
        System.out.println();

       }
}