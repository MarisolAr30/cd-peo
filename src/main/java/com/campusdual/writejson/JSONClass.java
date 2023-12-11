package com.campusdual.writejson;

//public class JSONClass {
//    public void writeJSON(){
//    JsonObject gpu = new JSONObject();
//    gpu.put("quantity", 1);
//    gpu.put("text", "Tarjeta gráfica");
//        System.out.println(gpu.toJSONString());
//    }
//    JsonObject cpu = new JSONObject();
//    cpu.put("quantity", 1);
//    cpu.put("text", "CPU");
//        System.out.println(cpu.toJSONString());
//    }
//    JsonObject fan = new JSONObject();
//    fan.put("quantity", 1);
//    fan.put("text", "Ventiladores");
//    System.out.println(fan.toJSONString());
//    }
//
//    JSONArray componentList = new JSONArray();
//    componentList.add(cpu);
//    componentList.add(gpu);
//    componentList.add(fan);
//    System.out.println(componentList.toJSONString());
//
//    JSONObject objComponent = new JSONObject();
//    objComponent.put("components", componentList);
//    System.out.println(objComponent.toJSONString());
//
//    try (FileWriter fw= new FileWriter ("scr/main/resources/componentList.json")){
//            fw.write(objComponent.toJSONString());
//            fw.flush();
//            } catch (IOException e){
//                throw new RuntineException(e);
//            }
//
//
//public void readJSON(){
//        try(FileReader fw = new FileReader ( "scr/main/resources/componentList.json")){
//        JSONObject parse = (JSONObject)parser.parse(fw);
//        JSONArray components = (JSONArray)parse.get("components")
//        System.out.println(component.toJSONString());
//
//        }catch (IOException | ParseException e){
//        throw new RuntineException(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        JSONClass json = new JSONClass();
//        json.writeJSON();
//        son.readJSON();}
//}
