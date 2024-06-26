package co.edu.uco.tiendachepito.crosscutting.helpers;
import static co.edu.uco.tiendachepito.crosscutting.helpers.ObjectHelper.getObjectHelper;

public final class TextHelper {

    public static final String EMPTY = "";

    private TextHelper(){
        super();
    }

    public static final boolean isNull(final String string){
        return ObjectHelper.getObjectHelper().isNUll(string);
    }

    public static final boolean isNullOrEmpty(final String string){
        return isNull(string) || EMPTY.equals(applyTrim(string));
    }

    public static final String applyTrim(final String string){
        return getDefault(string).trim();
    }

    public static final String getDefault(final String string, final String defaultValue){
        return getObjectHelper().getDefault(string, defaultValue);
    }

    public static final String getDefault(final String string){
        return getDefault(string, EMPTY);
    }
}
