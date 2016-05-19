    /*
     * Copyright (C) 2016 Muhammed Irshad
     *
     * Licensed under the Apache License, Version 2.0 (the "License");
     * you may not use this file except in compliance with the License.
     * You may obtain a copy of the License at
     *
     *      http://www.apache.org/licenses/LICENSE-2.0
     *
     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */
    package com.irshu.libs;
    import android.content.Context;
    import android.graphics.Bitmap;
    import android.util.AttributeSet;
    import android.widget.TableLayout;
    import com.irshu.libs.models.ControlStyles;
    import com.irshu.libs.models.EditorState;
    import com.irshu.libs.models.state;
    import java.util.List;
    public class Editor extends BaseClass {
        public Editor(Context context, AttributeSet attrs) {
                   super(context, attrs);
                   this.listener=null;
                  //  initialize(context,_ParentView,_RenderType,_PlaceHolderText);
                }

        public void setEditorListener(EditorListener _listener){
            this.listener=_listener;
        }
        public void StartEditor(){
            inputExtensions.InsertEditText(0, this.PlaceHolder, "");
        }

        public void InsertImage(Bitmap bitmap){
            imageExtensions.InsertImage(bitmap);
        }
        public void InsertMap(){
            mapExtensions.loadMapActivity();
        }
        public void InsertMap(String Cords, boolean InsertEditText){
            mapExtensions.insertMap(Cords, InsertEditText);
        }
        public void InsertList(boolean isOrdered){
            listItemExtensions.Insertlist(isOrdered);
        }
        public void InsertDivider(){
            dividerExtensions.InsertDivider();
        }
        public void UpdateTextStyle(ControlStyles style){
            inputExtensions.UpdateTextStyle(style,null);
        }
        public void InsertLink() {
            inputExtensions.InsertLink();
        }

        public void OpenImagePicker() {
            imageExtensions.OpenImageGallery();
        }
        public void RestoreState(){
            EditorState state=GetStateFromStorage();
            RenderEditor(state);
        }
        public void RenderEditor(EditorState _state) {
            super.RenderEditor(_state);
        }





    //    public void AttachHandlers() {
    //        Activity _activity = (Activity) _Context;
    //        _activity.findViewById(R.id.action_map).setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //           //     Intent intent=new Intent(_Context, MapsActivity.class);
    //            //    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    //            //    ((Activity) _Context).startActivityForResult(intent,20);
    //                //insertMap("");
    //            }
    //        });
    //    }

    }