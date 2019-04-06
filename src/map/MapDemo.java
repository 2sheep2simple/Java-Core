package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public void demo(){
        Map map = new HashMap<String,Integer>();
        this.addMaps(map);  // HashMap添加3组映射
        System.out.println(this.entrySet(map)); // 打印视图
        this.traverseMap(map); // 遍历映射集
        System.out.println(this.getMapSize(map));// 获取Map的映射数目
        System.out.println(this.getValueWithKey(map,"苏文进")); // 根据键值获取数值
        System.out.println(this.ifContainsKey(map,"孙永飞")); // 判断关于"孙永飞"的映射关系是否存在
        System.out.println(this.ifExistRemoveOneMapWithKey(map,"苏文进")); // 若关于"苏文进"的映射关系存在就删除它
        this.clearMap(map); // 清除map中的所有映射
        System.out.println(this.isEmpty(map)); // 判断映射集是否为空
    }

    /*/*
    * @Descript 为map添加3组键值对
    * @Date 15:38 2019/4/6
    * @Param [map]
    * @Return java.util.Map
    **/
    public Map addMaps(Map map){
        map.put("苏文进",99);
        map.put("孙永飞",12);
        map.put("闫向峰",81);
        return map;
    }

    /*/*
    * @Descript 返回map中键值对的数量
    * @Date 15:37 2019/4/6
    * @Param [map]
    * @Return int
    **/
    public int getMapSize(Map map){
        return map.size();
    }

    /*/*
    * @Descript 通过key键查询其对应的Value
    * @Date 15:36 2019/4/6
    * @Param [map, key]
    * @Return java.lang.Integer
    **/
    public  Integer getValueWithKey(Map map,String key){
        return (Integer) map.get(key);
    }

    /*/*
    * @Descript 若集合中存在关于key的映射关系就删除它
    * @Date 15:35 2019/4/6
    * @Param [map, key]
    * @Return java.lang.Object
    **/
    public Object ifExistRemoveOneMapWithKey(Map map, String key){
        return map.remove(key);  // 疑问：返回值是什么？  返回值是该键对应的值

    }

    /*/*
    * @Descript 清除该map中的所有映射关系
    * @Date 15:34 2019/4/6
    * @Param [map]
    * @Return void
    **/
    public void clearMap(Map map){
        map.clear();
    }

    /*/*
    * @Descript 判断该map是否为空，若为空则返回true
    * @Date 15:33 2019/4/6
    * @Param [map]
    * @Return boolean
    **/
    public boolean isEmpty(Map map){
        return map.isEmpty();
    }

    /*/*
    * @Descript 根据键值key判断map中关于该键的映射是否存在，若存在则返回true
    * @Date 15:30 2019/4/6
    * @Param [map, key]
    * @Return boolean
    **/
    public boolean ifContainsKey(Map map,String key){
        return map.containsKey(key);
    }

    /*/*
    * @Descript 获取map的set视图
    * @Date 15:56 2019/4/6
    * @Param [map]
    * @Return java.util.Set
    **/
    public Set entrySet(Map map){
        return map.entrySet();
    }

    /*/*
    * @Descript  通过遍历每个每个键来遍历对应的值，这是效率最高的遍历方法之一
    * @Date 16:00 2019/4/6
    * @Param [map]
    * @Return void
    **/
    public void traverseMap(Map map){

        // keySet是键的集合，Set里面的类型即key的类型
        //entrySet是 键-值 对的集合，Set里面的类型是Map.Entry
        // 使用KeySet进行遍历
        for (Object key : map.keySet()) {
            System.out.println(key + " ：" + map.get(key));
        }

    }
}