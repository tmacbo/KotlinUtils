package com.tmacbo.kotlinutils.utils

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.tmacbo.kotlinutils.R
import org.jetbrains.anko.*

/**
 * @Author tmacbo
 * @Since on 2017/6/23  23:02
 * @mail tang_bo@hotmail.com
 * @Description TODO
 */
class AsyncUtil : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        UI().setContentView(this@AsyncUtil)
    }

    lateinit var name: EditText
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button


    inner class UI : AnkoComponent<AsyncUtil> {
        override fun createView(ui: AnkoContext<AsyncUtil>): View {
            return with(ui) {
                verticalLayout {
                    val textView = textView("我是一个TextView") {
                        textSize = sp(13).toFloat()
                        textColor = context.resources.getColor(R.color.colorPrimary)
                    }.lparams {
                        margin = dip(10)
                        height = dip(40)
                        width = matchParent

                    }
                    name = editText{
                        hint = "登录账户"
                    }
                    button1 = button("Toast测试") {
                        onClick { view ->
                            toast("Hello, ${name.text}!")
                        }
                    }.lparams {
                        margin = dip(20)
                    }
                    button2 = button("对话框测试") {
                        onClick { view ->
                            alert("我是Dialog") {
                                yesButton { toast("yes") }
                                noButton { toast("no") }
                            }.show()
                        }
                    }.lparams {
                        leftMargin = dip(20)
                        rightMargin = dip(20)
                    }
                    button3 = button("线程测试") {
                        onClick { view ->
                            click()
                        }
                    }.lparams {
                        margin = dip(20)
                    }
                }
            }
        }
    }


    private fun click() {

        doAsync {
            Thread.sleep(3000)
            uiThread { toast("线程${Thread.currentThread().name}") }
        }
    }

    override fun onClick(v: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (v.id == button1.id) {
            toast("Hello, ${name.text}!")
        } else if (v.id == button2.id) {
            alert("我是Dialog") {
                yesButton { toast("yes") }
                noButton { toast("no") }
            }.show()
        } else if (v.id == button3.id) {
            doAsync {
                Thread.sleep(3000)
                uiThread { toast("线程${Thread.currentThread().name}") }
            }
        }
    }

}















