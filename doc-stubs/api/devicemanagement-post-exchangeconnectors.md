---
title: "Create deviceManagementExchangeConnector"
description: "Create a new deviceManagementExchangeConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementExchangeConnector
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new deviceManagementExchangeConnector object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /deviceManagement/exchangeConnectors
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementExchangeConnector](../resources/devicemanagementexchangeconnector.md) object.

The following table shows the properties that are required when you create the [deviceManagementExchangeConnector](../resources/devicemanagementexchangeconnector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|connectorServerName|String|The name of the server hosting the Exchange Connector.|
|exchangeAlias|String|An alias assigned to the Exchange server|
|exchangeConnectorType|deviceManagementExchangeConnectorType|The type of Exchange Connector Configured. Possible values are: `onPremises`, `hosted`, `serviceToService`, `dedicated`.|
|exchangeOrganization|String|Exchange Organization to the Exchange server|
|lastSyncDateTime|DateTimeOffset|Last sync time for the Exchange Connector|
|primarySmtpAddress|String|Email address used to configure the Service To Service Exchange Connector.|
|serverName|String|The name of the Exchange server.|
|status|deviceManagementExchangeConnectorStatus|Exchange Connector Status. Possible values are: `none`, `connectionPending`, `connected`, `disconnected`.|
|version|String|The version of the ExchangeConnectorAgent|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementExchangeConnector](../resources/devicemanagementexchangeconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementexchangeconnector_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/exchangeConnectors
Content-Type: application/json
Content-length: 370

{
  "@odata.type": "#microsoft.graph.deviceManagementExchangeConnector",
  "connectorServerName": "String",
  "exchangeAlias": "String",
  "exchangeConnectorType": "String",
  "exchangeOrganization": "String",
  "lastSyncDateTime": "String (timestamp)",
  "primarySmtpAddress": "String",
  "serverName": "String",
  "status": "String",
  "version": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementExchangeConnector"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementExchangeConnector",
  "id": "017f810b-810b-017f-0b81-7f010b817f01",
  "connectorServerName": "String",
  "exchangeAlias": "String",
  "exchangeConnectorType": "String",
  "exchangeOrganization": "String",
  "lastSyncDateTime": "String (timestamp)",
  "primarySmtpAddress": "String",
  "serverName": "String",
  "status": "String",
  "version": "String"
}
```

