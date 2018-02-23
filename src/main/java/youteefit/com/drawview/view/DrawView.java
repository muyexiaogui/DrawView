package youteefit.com.drawview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by lhx
 * date:on 2018/2/23 0023.
 * TODO :自定义视图 跟随手指的小球
 */

public class DrawView extends View{

    private float currentX = 40;
    private float currentY = 50;
    Paint p = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, @Nullable AttributeSet set) {
        super(context, set);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔的颜色
        p.setColor(Color.RED);
        //绘制一个小圆
        canvas.drawCircle(currentX,currentY,15,p);
    }

    //为该组件的触摸事件重写事件处理方法
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //修改currentX currentY两个属性
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件重新绘制自己
        invalidate();
        return super.onTouchEvent(event);
    }
}
