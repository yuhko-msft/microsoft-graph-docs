---
title: "Create deviceManagementDomainJoinConnector"
description: "Create a new deviceManagementDomainJoinConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementDomainJoinConnector
Namespace: microsoft.graph



Create a new [deviceManagementDomainJoinConnector](../resources/devicemanagementdomainjoinconnector.md) object.

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
POST /deviceManagement/domainJoinConnectors
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementDomainJoinConnector](../resources/devicemanagementdomainjoinconnector.md) object.

The following table shows the properties that are required when you create the [deviceManagementDomainJoinConnector](../resources/devicemanagementdomainjoinconnector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The connector display name.|
|lastConnectionDateTime|DateTimeOffset|Last time connector contacted Intune.|
|state|deviceManagementDomainJoinConnectorState|The connector state. Possible values are: `active`, `error`, `inactive`.|
|version|String|The version of the connector.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementDomainJoinConnector](../resources/devicemanagementdomainjoinconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementdomainjoinconnector_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/domainJoinConnectors
Content-Type: application/json
Content-length: 202

{
  "@odata.type": "#microsoft.graph.deviceManagementDomainJoinConnector",
  "displayName": "String",
  "lastConnectionDateTime": "String (timestamp)",
  "state": "String",
  "version": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementDomainJoinConnector"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementDomainJoinConnector",
  "id": "204c40ad-40ad-204c-ad40-4c20ad404c20",
  "displayName": "String",
  "lastConnectionDateTime": "String (timestamp)",
  "state": "String",
  "version": "String"
}
```

