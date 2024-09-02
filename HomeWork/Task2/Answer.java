//package HomeWork.Task2;
//
//class Answer {
//    public static StringBuilder answer(String QUERY, String PARAMS) {
//        // Создаем объект JSONObject из строки PARAMS
//        JSONObject jsonParams = new JSONObject(PARAMS);
//
//        // Создаем StringBuilder для построения части WHERE
//        StringBuilder whereClause = new StringBuilder();
//
//        // Перебираем ключи и значения из JSON
//        boolean first = true; // Флаг для управления добавлением 'and'
//        for (String key : jsonParams.keySet()) {
//            String value = jsonParams.getString(key);
//            if (!"null".equals(value)) { // Игнорируем значения "null"
//                if (!first) {
//                    whereClause.append(" and ");
//                }
//                whereClause.append(key)
//                        .append("='")
//                        .append(value)
//                        .append("'");
//                first = false; // После первого добавления 'and' больше не нужен
//            }
//        }
//
//        // Добавляем сформированную часть WHERE к начальному запросу
//        return new StringBuilder(QUERY).append(whereClause);
//    }
//
//    public static void main(String[] args) {
//        // Пример использования метода
//        String query = "select * from students where ";
//        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//
//        System.out.println(answer(query, params).toString());
//    }
//}
