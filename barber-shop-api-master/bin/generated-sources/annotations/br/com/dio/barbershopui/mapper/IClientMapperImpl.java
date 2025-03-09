package br.com.dio.barbershopui.mapper;

import br.com.dio.barbershopui.controller.request.SaveClientRequest;
import br.com.dio.barbershopui.controller.request.UpdateClientRequest;
import br.com.dio.barbershopui.controller.response.ClientDetailResponse;
import br.com.dio.barbershopui.controller.response.ListClientResponse;
import br.com.dio.barbershopui.controller.response.SaveClientResponse;
import br.com.dio.barbershopui.controller.response.UpdateClientResponse;
import br.com.dio.barbershopui.entity.ClientEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-09T12:30:21-0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.41.0.z20250213-2037, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class IClientMapperImpl implements IClientMapper {

    @Override
    public ClientEntity toEntity(SaveClientRequest request) {
        if ( request == null ) {
            return null;
        }

        ClientEntity clientEntity = new ClientEntity();

        clientEntity.setEmail( request.email() );
        clientEntity.setName( request.name() );
        clientEntity.setPhone( request.phone() );

        return clientEntity;
    }

    @Override
    public SaveClientResponse toSaveResponse(ClientEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String phone = null;

        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        phone = entity.getPhone();

        SaveClientResponse saveClientResponse = new SaveClientResponse( id, name, email, phone );

        return saveClientResponse;
    }

    @Override
    public ClientEntity toEntity(long id, UpdateClientRequest request) {
        if ( request == null ) {
            return null;
        }

        ClientEntity clientEntity = new ClientEntity();

        if ( request != null ) {
            clientEntity.setEmail( request.email() );
            clientEntity.setName( request.name() );
            clientEntity.setPhone( request.phone() );
        }
        clientEntity.setId( id );

        return clientEntity;
    }

    @Override
    public UpdateClientResponse toUpdateResponse(ClientEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String phone = null;

        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        phone = entity.getPhone();

        UpdateClientResponse updateClientResponse = new UpdateClientResponse( id, name, email, phone );

        return updateClientResponse;
    }

    @Override
    public ClientDetailResponse toDetailResponse(ClientEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String phone = null;

        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        phone = entity.getPhone();

        ClientDetailResponse clientDetailResponse = new ClientDetailResponse( id, name, email, phone );

        return clientDetailResponse;
    }

    @Override
    public List<ListClientResponse> toListResponse(List<ClientEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ListClientResponse> list = new ArrayList<ListClientResponse>( entities.size() );
        for ( ClientEntity clientEntity : entities ) {
            list.add( clientEntityToListClientResponse( clientEntity ) );
        }

        return list;
    }

    protected ListClientResponse clientEntityToListClientResponse(ClientEntity clientEntity) {
        if ( clientEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String email = null;
        String phone = null;

        id = clientEntity.getId();
        name = clientEntity.getName();
        email = clientEntity.getEmail();
        phone = clientEntity.getPhone();

        ListClientResponse listClientResponse = new ListClientResponse( id, name, email, phone );

        return listClientResponse;
    }
}
