package com.wudh.study.javastudy.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class MainCollection {

    /**
     * 一.Java集合
     *
     *
     * 1.Set    无序不可重复的集合
     * 2.Queue  一种队列形式的集合
     * 3.Map    一种映射关系的集合
     * 4.List   一种有序可重复集合
     */

    /**
     * Java集合和数组的区别：
     * ①.数组长度在初始化时指定，意味着只能保存定长的数据。而集合可以保存数量不确定的数据。
     *  同时可以保存具有映射关系的数据（即关联数组，键值对 key-value）。
     * ②.数组元素即可以是基本类型的值，也可以是对象。集合里只能保存对象（实际上只是保存对象的引用变量）
     *  基本数据类型的变量要转换成对应的包装类才能放入集合类中。
     */
    protected Set<?> set;
    protected Queue<?> queue;
    protected Map<?,?> map;
    protected List<?> list;

    /**
     * 二.Collection接口
     */

    /**1.接口中定义的方法*/
    Collection<?> collection=new Collection<Object>() {
        //返回collection中元素的个数
        @Override
        public int size() {
            return 0;
        }

        //判断是否包含元素
        @Override
        public boolean isEmpty() {
            return false;
        }

        //是否包含某个元素
        @Override
        public boolean contains(Object o) {
            return false;
        }

        //迭代器
        @Override
        public Iterator<Object> iterator() {
            return null;
        }

        //返回包含集合所有元素的数组
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        //返回包含集合所有元素的数组并且转为指定类型的元素
        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        //添加指定类型的元素，不符合返回false
        @Override
        public boolean add(Object o) {
            return false;
        }
        //移除指定类型的元素，如果存在
        @Override
        public boolean remove(Object o) {
            return false;
        }

        //是否包含传入集合的所有元素
        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        //添加传入集合的所有元素
        @Override
        public boolean addAll(Collection<?> collection) {
            return false;
        }

        //移除传入集合的所有元素
        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        //仅保留传入集合和该集合的交集，其他删除
        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        //移除所有元素
        @Override
        public void clear() {

        }
    };


    /**
     * 2.Set比Collection 多了不能有重复元素 其他方法都一致
     *   add()添加相同元素返回flase
     */

    /**
     * 三. List集合
     * 继承Collection接口 并且增加了索引
     * 集合中每个元素都有其对应的顺序索引
     * List集合允许使用重复元素，可以通过索引来访问指定位置的集合元素
     */

    List<?> list1=new List<Object>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Object> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<?> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        //获取指定位置元素
        @Override
        public Object get(int i) {
            return null;
        }

        //设置指定位置元素
        @Override
        public Object set(int i, Object o) {
            return null;
        }

        //在指定位置插入元素，后面的元素排序向后+1
        @Override
        public void add(int i, Object o) {

        }

        //删除指定位置元素，后面的元素排序-1
        @Override
        public Object remove(int i) {
            return null;
        }

        //定位第一次出现某元素的序号，如果此列表不包含该元素，则返回 -1
        @Override
        public int indexOf(Object o) {
            return 0;
        }

        //定位最后一次出现某元素的序号，如果此列表不包含该元素，则返回 -1
        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        //ListIterator迭代器
        @Override
        public ListIterator<Object> listIterator() {
            return null;
        }
        //ListIterator迭代器 int i指定起迭代器的起始位置
        @Override
        public ListIterator<Object> listIterator(int i) {
            return null;
        }

        //返回 前开后闭 范围的元素集合
        @Override
        public List<Object> subList(int i, int i1) {
            return null;
        }
    };
    /**
     * 四.Map集合
     * ①.与Set集合的关系
     * 如果 把Map里的所有key放在一起看，它们就组成了一个Set集合（所有的key没有顺序，key与key之间不能重复
     *  实际上Map确实包含了一个keySet()方法，用户返回Map里所有key组成的Set集合
     * ②.与List集合的关系
     * 如果把Map里的所有value放在一起来看，它们又非常类似于一个List：元素与元素之间可以重复
     *  每个元素可以根据索引来查找，只是Map中索引不再使用整数值，而是以另外一个对象作为索引。
     */

    Map<?,?> map1=new Map<Object, Object>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object o) {
            return false;
        }

        @Override
        public boolean containsValue(Object o) {
            return false;
        }

        @Override
        public Object get(Object o) {
            return null;
        }

        @Override
        public Object put(Object o, Object o2) {
            return null;
        }

        @Override
        public Object remove(Object o) {
            return null;
        }

        @Override
        public void putAll(Map<?, ?> map) {

        }

        @Override
        public void clear() {

        }

        //返回所有的键Set集合
        @Override
        public Set<Object> keySet() {
            return null;
        }

        //返回所有的值的Collection集合
        @Override
        public Collection<Object> values() {
            return null;
        }
        //返回所有的键-值对集合
        @Override
        public Set<Entry<Object, Object>> entrySet() {
            return null;
        }
    };
    /**
     * Map包含Entry内部类 一个键-值对
     */
    Map.Entry entry=new Map.Entry() {
        @Override
        public Object getKey() {
            return null;
        }

        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public Object setValue(Object o) {
            return null;
        }
    };
    /**五.
     *
     * 1.Collection的Iterator遍历
     *
     * hasNext()
     * next()
     * 修改iterator.next() 等于修改了集合的元素
     * 因为Iterator迭代传递的是引用，而不是值
     *
     * 2.Map的遍历
     *
     *
     * */

    public static void main(String[] args) {
        List<MyObject> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new MyObject(i));
        }

        System.out.println(list.toString());

        Iterator<MyObject> iterator = list.iterator();
        //集合元素的值传给了迭代变量，仅仅传递了对象引用。保存的仅仅是指向对象内存空间的地址
        while (iterator.hasNext()) {
            MyObject next = iterator.next();
            next.num = 99;
        }

        System.out.println(list.toString());

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"第一个");
        map.put(2,"第二个");

        Set<Integer> set=map.keySet();
        //method one
        for (Integer key:set){
            String value=map.get(key);
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        //method two
        for (Map.Entry<Integer, String> entry:entries){
            entry.getKey();
            entry.getValue();
        }
    }
    static class MyObject {
        int num;

        MyObject(int num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return String.valueOf(num);
        }
    }
    /**
     * 总结:
     * 1.Map和Collection是集合的两个父接口
     * 2.集合的遍历得到的都是引用对象，导致了遍历里可以直接修改元素的值
     * 3.所有集合里的元素都是对象，基本类型需要封装
     */
}
