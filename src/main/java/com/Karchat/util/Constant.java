package com.Karchat.util;

import com.Karchat.entity.Friends;
import com.Karchat.entity.History;
import com.Karchat.util.BeansUtil.KarConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 程序用到的常量
 */
public class Constant {
    //客户端判断
    public static boolean isStart = false;  //是否已经启动了程序
    public static boolean isInitializedChatWindowSuccessfully = false;  ////初始化聊天窗口成功


    //Spring上下文
    public static ApplicationContext context = new AnnotationConfigApplicationContext(KarConfiguration.class);

    //我的账号密码
    public static String usernameAll = "";  //我的账号
    public static String passwordAll = "";  //我的密码
    public static int friendsAmount = 0;  //我的好友数量

    //Controller的相关判断
    public static boolean login = false;  //登录
    public static boolean loginSuccess = false;  //登录成功
    public static boolean register = false;  //注册
    public static boolean remember = false;  //保存密码
    public static boolean getMyIcon = false;  //获取我的头像
    public static boolean get = false;  //获取待同意的好友邀请
    public static boolean getSbIcon = false;  //获取待同意的好友邀请的好友头像
    public static boolean post = false;  //获取已发送的好友邀请
    public static boolean postSbIcon = false;  //获取已发送的好友邀请的好友头像
    public static boolean addFriend = false;  //加好友
    public static boolean addState = false;  //同意好友邀请
    public static boolean deleteAddFriend = false;  //拒绝好友邀请
    public static boolean checkFriends = false;  //查看用户的所有好友
    public static boolean checkFriendsNameOnly = false;  //查看用户的所有好友姓名
    public static boolean getFriendIcon = false;  //获得好友的头像
    public static boolean getFriendIconNew = false;  //刷新好友列表，获取新的好友
    public static boolean getUserState = false;  //获得好友在线状态
    public static boolean getUserStateIsFinish = false;  //获得好友在线状态是否完成
    public static boolean putInUserContentIsFinished = false;  //获取新好友头像后，要把用户姓名放入userContent中，标志位代表已经放入成功，在之后查找历史记录获取时需要等待此完成





    //Controller要发送的相关存储信息
    public static String addStateName;  //刚同意好友邀请的好友名字
    public static String deleteAddFriendName;  //删除好友邀请的好友姓名
    public static Friends[] friends = null;  //朋友列表
    public static HashMap<String, Boolean> isSomeBodyFinished = new HashMap<>();  //存放获取历史记录某个人是否获取完
    public static HashMap<String, Boolean> isSomeBodyFinishedFirstTime = new HashMap<>();  //存放获取历史记录某个人是否获取完,这是第一次初始化的记录
    public static HashMap<String, ArrayList<History>> historysFactory = new HashMap<>();  //储存某个人的所有聊天记录
    public static HashMap<String, Integer> historyAmount = new HashMap<>();  //储存某个人的聊天记录数量







    //后台相关判断
    public static boolean isGetFinished = false;  //获取待同意邀请是否完成
    public static boolean isGetIconsFinished = false;  //获取待同意邀请好友头像是否完成
    public static boolean isPostFinished = false;  //获取已发送邀请是否完成
    public static boolean isPostIconsFinished = false;  //获取已发送邀请好友头像是否完成
    public static boolean isFlashing = false;  //是否正在执行刷新加好友画布
    public static boolean isCheckingHistory = false;  //是否正在执行查找历史记录
    public static boolean isGetFriendAmount = false;  //是否获取全部好友数量
    public static boolean isSending = false;  //是否正在发送
    public static boolean isAddingFriends = false;  //是否正在加好友
    public static boolean isGettingListOfFriends = false;  //是否正在获得好友列表
    public static boolean whetherBackgroundCanEnabled = false;  //后台线程是否可以开启，需要完成加好友界面初始化
    public static boolean whetherFriendsToTableIndex = false;  //是否用户名对应聊天表下标
    public static boolean initFinishAndCanFlashChatHistory = false;  //聊天记录初始化成功，可以进行聊天记录的刷新
    public static boolean getFriendIconsSuccess = false;  //是否获取好友头像成功
    public static boolean getFriendStatesSuccess = false;  //是否获取好友状态成功
    public static boolean isRefreshFriendsList = false;  //是否正在刷新好友聊天列表
    public static boolean isCreateNewInnerLabel = false;  //创建新的好友聊天界面是否正在进行
    public static boolean isAgreeFriends= false;  //是否正在同意好友邀请
    public static boolean isDisAgreeFriends= false;  //是否正在同意好友邀请
    public static boolean isHomeInitInnerLabelCanJump= false;  //没有好友现在，Home里等待好友初始化完成再初始化聊天界面的过程可以跳过了
    public static boolean isRefreshingStates= false;  //是否正在刷新好友在线状态


    public static int[] mouseXY = new int[2];  //存储当前鼠标的xy


}
