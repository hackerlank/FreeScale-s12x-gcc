// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_lt_LT extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = ".";
  static final String numberFormat = "#,###,##0.###";
  static final String percentFormat = "#,###,##0%";
  static final String[] weekdays = { null, "Sekmadienis", "Pirmadienis", "Antradienis", "Tre\u010Diadienis", "Ketvirtadienis", "Penktadienis", "\u0160e\u0161tadienis" };

  static final String[] shortWeekdays = { null, "Sk", "Pr", "An", "Tr", "Kt", "Pn", "\u0160t" };

  static final String[] shortMonths = { "Sau", "Vas", "Kov", "Bal", "Geg", "Bir", "Lie", "Rgp", "Rgs", "Spa", "Lap", "Grd", null };

  static final String[] months = { "sausio", "vasario", "kovo", "baland\u017Eio", "gegu\u017E\u0117s", "bir\u017Eelio", "liepos", "rugpj\u016B\u010Dio", "rugs\u0117jo", "spalio", "lapkri\u010Dio", "gruod\u017Eio", null };

  static final String[] ampms = { "", "" };

  static final String shortDateFormat = "yyyy.MM.dd";
  static final String defaultTimeFormat = "";
  static final String currencySymbol = "Lt";
  static final String intlCurrencySymbol = "LTL";
  static final String currencyFormat = "#,###,##0.00 $;-#,###,##0.00 $";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents () { return contents; }
}
