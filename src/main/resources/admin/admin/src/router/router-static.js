import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import ziliaofenlei from '@/views/modules/ziliaofenlei/list'
    import wenda from '@/views/modules/wenda/list'
    import discussziliaoxiazai from '@/views/modules/discussziliaoxiazai/list'
    import ziliaoxiazai from '@/views/modules/ziliaoxiazai/list'
    import discusswenda from '@/views/modules/discusswenda/list'
    import storeup from '@/views/modules/storeup/list'
    import discusswenzhangxinxi from '@/views/modules/discusswenzhangxinxi/list'
    import forum from '@/views/modules/forum/list'
    import yonghu from '@/views/modules/yonghu/list'
    import wenzhangfenlei from '@/views/modules/wenzhangfenlei/list'
    import messages from '@/views/modules/messages/list'
    import wenzhangxinxi from '@/views/modules/wenzhangxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/ziliaofenlei',
        name: '资料分类',
        component: ziliaofenlei
      }
      ,{
	path: '/wenda',
        name: '问答',
        component: wenda
      }
      ,{
	path: '/discussziliaoxiazai',
        name: '资料下载评论',
        component: discussziliaoxiazai
      }
      ,{
	path: '/ziliaoxiazai',
        name: '资料下载',
        component: ziliaoxiazai
      }
      ,{
	path: '/discusswenda',
        name: '问答评论',
        component: discusswenda
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discusswenzhangxinxi',
        name: '文章信息评论',
        component: discusswenzhangxinxi
      }
      ,{
	path: '/forum',
        name: '论坛交流',
        component: forum
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/wenzhangfenlei',
        name: '文章分类',
        component: wenzhangfenlei
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/wenzhangxinxi',
        name: '文章信息',
        component: wenzhangxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
