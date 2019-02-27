package com.geektcp.alpha.algorithm.tree.simple.tree3;

import alpha.common.base.util.ObjectUtils;

import java.util.List;
import java.util.Objects;

/**
 * Created by tanghaiyang on 2019/1/10.
 */
public class VoTreeBuilder {

    private static <T extends BaseTreeNodeVo> boolean insertNode(T currentNode, T childNode) {
        if( currentNode.getId().equals(childNode.getParentId()) ){
            currentNode.add(childNode);
            return true;
        }
        if (Objects.nonNull(currentNode.getChildren())){
            currentNode.getChildren().forEach(currentChildNode ->{
                insertNode(currentChildNode, childNode);
            });
        }
        return false;
    }


    /*
    * para list will be modified when excute recursive inserting, so need deepcopy
    *
    * 使用Collections.copy还是会修改参数list的元素，使用clone也会修改，这两种方式都是浅拷贝
    * 只有使用深度拷贝时，才会有不改变参数list的值
    * */
    @SuppressWarnings("all")
    public static <T extends BaseTreeNodeVo> T createTree(List<T> list, Class<T> clazz)
            throws IllegalAccessException, InstantiationException {
//        BaseTreeNodeVo currentNode = new BaseTreeNodeVo();
        T currentNode = clazz.newInstance();
        List<T> listCopy = (List<T>) ObjectUtils.deepCopy(list);
        if(Objects.nonNull(listCopy)) {
            listCopy.forEach(childNode -> { insertNode(currentNode, childNode); });
        }
        return currentNode;
    }

    public static <T extends BaseTreeNodeVo> List createTreeList(List<T> list, Class<T> clazz)
            throws IllegalAccessException, InstantiationException {
        return createTree(list, clazz).getChildren();
    }

}
