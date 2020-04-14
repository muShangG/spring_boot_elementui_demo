package com.example.spring_boot_elementui_demo.dao;

import com.example.spring_boot_elementui_demo.entity.SysMenuList;

import java.util.List;

public class MenuDao {


    private List<SysMenuList> menuInfo;

    public List<SysMenuList> getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(List<SysMenuList> menuInfo) {
        this.menuInfo = menuInfo;
    }

    public static class MenuInfoBean {
        private List<ChildBeanX> child;

        public List<ChildBeanX> getChild() {
            return child;
        }

        public void setChild(List<ChildBeanX> child) {
            this.child = child;
        }

        public static class ChildBeanX {
            /**
             * title : 主页模板
             * href :
             * icon : fa fa-home
             * target : _self
             * child : [{"title":"主页一","href":"page/welcome-1.html","icon":"fa fa-tachometer","target":"_self"},{"title":"主页二","href":"page/welcome-2.html","icon":"fa fa-tachometer","target":"_self"},{"title":"主页三","href":"page/welcome-3.html","icon":"fa fa-tachometer","target":"_self"}]
             */

            private String title;
            private String href;
            private String icon;
            private String target;
            private List<ChildBean> child;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public List<ChildBean> getChild() {
                return child;
            }

            public void setChild(List<ChildBean> child) {
                this.child = child;
            }

            public static class ChildBean {
                /**
                 * title : 主页一
                 * href : page/welcome-1.html
                 * icon : fa fa-tachometer
                 * target : _self
                 */

                private String title;
                private String href;
                private String icon;
                private String target;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getTarget() {
                    return target;
                }

                public void setTarget(String target) {
                    this.target = target;
                }
            }
        }
    }
}
