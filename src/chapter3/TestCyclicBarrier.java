package chapter3;

import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

    private static final int THREAD_NUM = 5;
    
    public static class WorkerThread implements Runnable{

        CyclicBarrier barrier;
        
        public WorkerThread(CyclicBarrier b){
            this.barrier = b;
        }
        
        @Override
        public void run() {
            // TODO Auto-generated method stub
            try{
                System.out.println("ID:"+Thread.currentThread().getId()+"Worker's waiting");
                //�߳�������ȴ���ֱ�������̶߳�����barrier��
                barrier.await();
                System.out.println("ID:"+Thread.currentThread().getId()+" Working");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    /**
     * 
     * <p>
     * </p>
     * @author zhangjunshuai
     * @date 2014-9-29 ����11:27:36
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CyclicBarrier cb = new CyclicBarrier(THREAD_NUM, new Runnable() {
            //�������̵߳���barrierʱִ��
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("Inside Barrier");
                
            }
        });
        
        for(int i=0;i<THREAD_NUM;i++){
            new Thread(new WorkerThread(cb)).start();
        }
    }

}
/*
�����������
Worker's waiting
Worker's waiting
Worker's waiting
Worker's waiting
Worker's waiting
Inside Barrier
ID:12 Working
ID:8 Working
ID:11 Working
ID:9 Working
ID:10 Working
*/