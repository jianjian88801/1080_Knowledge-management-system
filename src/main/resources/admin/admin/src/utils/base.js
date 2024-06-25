const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0w575/",
            name: "springboot0w575",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0w575/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "知识管理系统"
        } 
    }
}
export default base
