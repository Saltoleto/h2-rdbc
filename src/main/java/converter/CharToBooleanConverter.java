package converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;


@ReadingConverter
public class CharToBooleanConverter implements Converter<String, Boolean> {
    @Override
    public Boolean convert(String source) {
        return "S".equals(source);
    }
}
