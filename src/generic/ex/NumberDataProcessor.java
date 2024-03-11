package generic.ex;

public class NumberDataProcessor implements DataProcessor<Integer> {
    @Override
    public Integer processData(Integer data) {
        return data *2;
    }
}
