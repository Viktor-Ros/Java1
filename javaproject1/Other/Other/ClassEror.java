package Other;

public class ClassEror {

    public List<WebElement> getSomeElements(String path) {
        if (path == null){
                throw IllegalArgumentException("getElements: illegal path (NULL)");
                path = "//*[@id='Hello']";
        }       
        WebDriverHelper wd = new WebDriverHelper();
        List<String> result = new ArrayList<>();
        result.add(wd.getElements(path));

        if (result.isEmpty()){//нет смысла перебирать пустые списки, код в этом if не исполнится
                for(WebElement element : result){
                        if(element.getText() == "remove")//String сравнивают через equals => element.getText().equals("remove")
                                result.remove(element);
                }
        } else {
                return result.get(0);//т.к. метод возвращает тип данных List<WebElement>, а не String
        }

        if (wd.isElementsPresent(path)) {
                System.out.println("There aren't any elements by this path");
                return;//тут вообще ничего не возвращается
        }

        return result;
    }
}