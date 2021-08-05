---
title: "Connection API"
description: "Connection settings API"
author: mecampos
localization_priority: Priority
doc_type: conceptualPageType
ms.prod: search
---

# Connection API

This topic describes settings and management updates for the connector's connection settings API, and complements the guide to [Create, update, and delete connections in the Microsoft Graph](connecting-external-content-manage-connections.md).

## Connections

[Connections](/graph/api/resources/externalconnectors-externalconnection?view=graph-rest-beta) allow you to add content from an external source into Microsoft Graph, and are considered a unit of administration in the Microsoft Graph connector's platform. Once you've created the connection, you will be able to add [items](/graph/api/resources/externalconnectors-externalitem?view=graph-rest-beta) that must adhere to the Microsoft Graph external item structure.

A connection also allows your registered application to define a schema for items that will be ingested, and enables your service to add, update, or delete items from the external data source.

To provide a higher level of customization, connections now include more options for managing content, schema, and the supported content experiences. For example, support for connection-level settings, specifics settings for Microsoft Search, and creating [adaptive card templates](/adaptive-cards/) to render data (based on the schema), across the various [Microsoft 365](https://www.microsoft.com/microsoft-365) content experiences.


## Updates to the Connection entity

The Connection entity can use additional fields to provide more metadata and specific settings, reducing the number of API calls needed to setup a connection.

### Types of new fields


|Properties in setting  |Description  |Type  |
|---------|---------|---------|
|AppInfo     | App information used while displaying connection.       | MGE.applicationInfo        |
|AuthorizedAppIds     | Applications with permission on this connection.        | StringCollection        |
|Notifications     | List of notification info objects.        | MGE.notificationInfo        |
|Schema     | Connection schema.        | MGE.schema        |
|SearchSettings     | Search settings.        | MGE.searchSettings        |
|FeedSettings     | Feed settings.       | MGE.feedSettings        |
|ComplianceSettings     | Compliance settings.        | MGE.complianceSettings        |
|****MGE** = microsoft.graph.externalConnectors*|

#### Example of settings object
The following sample shows the use of the search, feed, and compliance properties listed in the table above.

```html
{
    "id": "servicenowhr",
    "name": "Contoso ServiceNow connection",
    "description": "ServiceNow KB for Contoso Corp",
    "connectorId": "52a39169-2645-449f-85b3-fb55c439e7a8",
    "appInfo": {
        "name": "Contoso connector",
        "icon": "https://cdn.contoso.com/images/logo"
    },
    "authorizedAppIds": [
        "d310d35d-72ec-47dd-92f2-fb9c40936555"
    ],
    "notifications": [
        {
            "clientId": "0b2fefc7-0e9e-4072-8803-8022e42d072c",
            "endpoint": "https://northwind.com/notification"
        }
    ],
    "schema": {},
    "searchSettings": {
        "resultTypes": [
            {
                "id": "contosoTickets",
                "condition": "severity lt 2",
                "displayTemplate": "{\"type\":\"AdaptiveCard……}",
                "priority": 1
            }
        ]
    },
    "feedSettings": {
        "urlToItemResolvers": [
            {
                "priority": 1,
                "lookupUrl": {
                    "urlPrefixes": [
                        "https://www.contoso.com"
                    ],
                    "urlPattern": "^/teams/(?<teamId>[^/]+)/tickets/(?<ticketId>[^/]+)))(/.+)?)?/?$"
                },
                "itemId": "lookupUrl.ticketId"
            },
            {
                "priority": 2,
                "lookupUrl": {
                    "urlPrefixes": [
                        "https://www.contoso.com"
                    ],
                    "urlPattern": "^/teams/(?<teamId>[^/]+)/tickets/(?<ticketId>[^/]+)))(/.+)?)?/?$"
                },
                "itemId": "sha512(item.properties.url)"
            }
        ]
    },
    "complianceSettings": {
        "resultTypes ": [
            {
                "id": "contosoTicketPreview",
                "displayTemplate": "{\"type\":\"AdaptiveCard……}",
                "priority": 1
            },
        ]
    }
}
```

## Update properties

The additional properties can be updated by a PATCH call on: **/Connections** entity.
For example, the following call will update appInfo and searchSettings while keeping other properties as they are:

```html
PATCH https://graph.microsoft.com/beta/external/connections('{connectionId}')
PATCH https://graph.microsoft.com/beta/external/connections('{connectionId}')
{
    "appInfo": {
        "name": "Contoso connector",
        "icon": "https://cdn.contoso.com/images/logo"
    },
    "searchSettings": {
        "resultTypes": [
            {
                "id": "contosoTickets",
                "condition": "severity lt 2",
                "displayTemplate": "{\"type\":\"AdaptiveCard……}",
                "priority": 1
            }
        ]
    }
}
```

## Get connections for a given connector
To get details on the connections for a given connectors you can use the following example:

```html
GET https://graph.microsoft.com/beta/external/connections?$filter = tolower(connectorId) eq 'cc29e42b-5273-4c34-a5f8-a25edcec077d' 
```

> [!NOTE]
> Publisher field is STRING, and comparison will be case sensitive. To ignore case use tolower/toupper for comparison.title Build – Connection.

## See also
To learn more about the Microsoft Graph connectors API, see [Working with the connectors API](connecting-external-content-connectors-api-overview.md).