package quiz.quiz4.ex4;

public class StringDataProcessor implements DataProcessor<String>{

    @Override
    public String processData(String data) {
        return data.toUpperCase();
    }
}
