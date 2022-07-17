package com.example.android.nsk.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.nsk.Places;
import com.example.android.nsk.Adapters.PlacesAdapter;
import com.example.android.nsk.R;

import java.util.ArrayList;
import java.util.List;


public class MuseumsFragment extends Fragment {

    RecyclerView placesRecyclerView;
    PlacesAdapter placesAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.place_recycler, container, false);

        placesRecyclerView = rootView.findViewById(R.id.recyclerView_place);

        List<Places> placesList = new ArrayList<>();
        placesList.add(new Places(1, "kraevedcheskiy_museiy", "Краеведческий музей",     "#DE8B76",        " Новосибирский государственный краеведческий музей основан в 1920 году. Исторический отдел с 1986 года находится в двухэтажном здании Городского торгового корпуса, построенном по проекту архитектора Крячкова в стиле рационалистического модерна (1910). Общая выставочная площадь краеведческого музея составляет 3219 кв. м.\n" +  "\n" + " Цоколь занимает постоянная экспозиция, рассказывающая о быте и обычаях коренных народов Сибири. Наиболее примечательны предметы - предметы, связанные с бытом сибирских народов. Истории Новосибирской области отведен 1-ый этаж, временным выставкам — 2-ой.\n" + "\n" + " Коллекция музея насчитывает 147 тыс. экспонатов в основном фонде и 71 тыс. - во вспомогательном."));
        placesList.add(new Places(2, "musey_imeny_rerixa",    "Музей имени Н.К. Рериха", "#DE8B76",        " Музей Н. К. Рериха в Новосибирске — музей, посвящённый жизни и деятельности семьи русского художника и общественного деятеля Николая Константиновича Рериха.\n" + "\n" + " Посетители музея имеют возможность познакомиться с философским, научным и художественным наследием Рерихов: Николая Константиновича — известного художника, писателя, учёного, путешественника, деятеля культуры; его супруги Елены Ивановны — философа-мистика, писателя и переводчика; сыновей: Юрия Николаевича — ученого-востоковеда, лингвиста, искусствоведа, этнографа; Святослава Николаевича — художника, учёного и деятеля культуры. В музее представлены репродукции картин, акварели Бориса Абрамова, фотокомпозиции, посвящённые семье Рерихов. Отдельная экспозиция музея рассказывает о его строительстве.\n" +  "\n" + " Музей Н. К. Рериха уникален тем, что он создавался методом народной стройки. Музей организован по инициативе основателя Сибирского Рериховского общества Наталии Дмитриевны Спириной, литератора, посвятившей всю свою жизнь изучению творческого наследия семьи Рерихов.\n" + "\n" + " В кризисный для России 1997 год на её призыв о строительстве Музея Николая Рериха откликнулись тысячи россиян. Свой вклад в создание Музея внесли также жители стран ближнего и дальнего зарубежья. В Новосибирске участниками народной стройки стали около 500 организаций. Существенная помощь была оказана учёными Сибирского отделения Российской Академии наук. Все имена строителей Новосибирского музея Н. К. Рериха, бескорыстно вносивших свои средства, записаны в Почётную книгу вкладов. Она издана в одном экземпляре и хранится как музейный экспонат."));
        //placesList.add(new Places(3, "java_2", "Другой парк", "#DE8B76", "test"));
        //placesList.add(new Places(4, "java_2", "Другой парк", "#DE8B76", "test"));
        //placesList.add(new Places(5, "java_2", "Другой парк", "#DE8B76", "test"));

        setPlacesRecycler(placesList);


        return rootView;
    }

    private void setPlacesRecycler(List<Places> placesList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL,false);

        placesRecyclerView.setLayoutManager(layoutManager);

        placesAdapter = new PlacesAdapter(getActivity(),placesList);
        placesRecyclerView.setAdapter(placesAdapter);
    }
}