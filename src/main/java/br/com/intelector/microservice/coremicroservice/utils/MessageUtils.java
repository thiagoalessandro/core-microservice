package br.com.intelector.microservice.coremicroservice.utils;

import br.com.intelector.microservice.coremicroservice.configuration.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtils {

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @Autowired
    private ApplicationProperties applicationProperties;

    private static final Locale LOCALE_DEFAULT = new Locale("pt","br");

    public String get(String code) {
        return messageSource.getMessage(code, new Object[]{}, getLocale());
    }

    public String get(String code, Object[] args) {
        return messageSource.getMessage(code, args, getLocale());
    }

    public String get(String code, String arg) {
        return messageSource.getMessage(code, new Object[]{arg}, getLocale());
    }

    public Locale getLocale(){
        if(!applicationProperties.isAppI18nEnable())
            return LOCALE_DEFAULT;
        return LocaleContextHolder.getLocale();
    }

}
