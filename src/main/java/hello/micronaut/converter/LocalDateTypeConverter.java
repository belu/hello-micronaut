package hello.micronaut.converter;

import io.micronaut.core.convert.ConversionContext;
import io.micronaut.core.convert.TypeConverter;

import javax.inject.Singleton;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Singleton
public class LocalDateTypeConverter implements TypeConverter<String, LocalDate> {

    @Override
    public Optional<LocalDate> convert(String object, Class<LocalDate> targetType, ConversionContext context) {
        return Optional.of(LocalDate.parse(object, DateTimeFormatter.ISO_DATE));
    }
}
