package z_Html_Editor_3209;

// https://javarush.ru/quests/lectures/questmultithreading.level08.lecture15
public class z_Tmp {
    // Сегодня мы напишем HTML редактор с графическим интерфейсом.
    // В качестве библиотеки для создания графического интерфейса воспользуемся Swing.
    // А в качестве архитектурного каркаса нашего приложения будем использовать MVC модель.

    // 3.1.1. JTabbedPane tabbedPane - это будет панель с двумя вкладками.
    // 3.1.2. JTextPane htmlTextPane - это будет компонент для визуального редактирования html.
    // Он будет размещен на первой вкладке.
    // 3.1.3. JEditorPane plainTextPane - это будет компонент для редактирования html в
    // виде текста, он будет отображать код html (теги и их содержимое).

    //  TabbedPaneChangeListener реализующий интерфейс ChangeListener в пакете listeners.
    //  Этот класс будет слушать и обрабатывать изменения состояния панели вкладок.

    // MenuHelper. Это будет вспомогательный класс для инициализации и настройки меню.

    // UndoMenuListener. Этот слушатель будет следить за меню, а если конкретнее, то за моментом,
    // когда меню редактирования будет выбрано пользователем.
    // В этот момент он будет запрашивать у представления можем ли мы сейчас отменить или вернуть
    // какое-то действие, и в зависимости от этого делать доступными или не доступными
    // пункты меню "Отменить" и "Вернуть".

    // UndoListener реализующий интерфейс UndoableEditListener в пакет listeners. Этот класс
    // будет следить за правками, которые можно отменить или вернуть.
    // неясно
    //       undoableEditHappened(UndoableEditEvent e). Он должен из переданного события
    //       получать правку и добавлять ее в undoManager.

    //  TextEditMenuListener в пакет listeners.
    //Этот класс будет работать аналогично классу UndoMenuListener только для других пунктов меню.
    //Пункты меню, отвечающие за стиль, шрифт, цвет и т.д. должны быть доступны только тогда,
    // когда в нашем редакторе выбрана первая вкладка.

    public static void main(String[] args) {

    }
}
