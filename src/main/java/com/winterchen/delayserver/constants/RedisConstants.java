package com.winterchen.delayserver.constants;

/**
 * redis 常量
 * @author winterchen 2020/5/19
 */
public interface RedisConstants {

    /**
     * 投递消息分布式锁
     */
    String DEFAULT_DELAY_PUSH_MSG_LOCK = "com.winterchen:delay:default:push:lock:";

    /**
     * 处理死信消息幂等性锁
     */
    String DEFAULT_DELAY_PROCESS_MSG_LOCK = "com.winterchen:delay:default:process:lock:";


    String DEFAULT_DELAY_PROCESS_RETRY_COUNT_PREFIX = "com.winterchen:delay:default:process:retrycount:";

    /**
     * 处理失败的消息
     */
    String DEFAULT_SAVE_DELAY_MESSAGG_BY_PROCESS_FAILED_SET = "com:geely:markting:delay:default:failed:process:items";

    /**
     * 投递失败的消息
     */
    String DEFAULT_SAVE_DELAY_MESSAGG_BY_PUSH_FAILED_SET = "com:geely:markting:delay:default:failed:push:items";

    /**
     * 超过重试次数的消息
     */
    String DEFAULT_SAVE_DELAY_MESSAGG_BY_OUT_RETRY_SET = "com:geely:markting:delay:default:failed:outretry:items";
}
