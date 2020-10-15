---
title: "Create azureConnections"
description: "Create a new AzureConnection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create azureConnections
Namespace: microsoft.graph

Create a new AzureConnection object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /azureConnections
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [AzureConnection](../resources/azureconnection.md) object.

The following table shows the properties that are required when you create the [AzureConnection](../resources/azureconnection.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|subscriptionId|String|**TODO: Add Description**|
|subscriptionName|String|**TODO: Add Description**|
|adDomainName|String|**TODO: Add Description**|
|adDomainUsername|String|**TODO: Add Description**|
|adDomainPassword|String|**TODO: Add Description**|
|organizationalUnit|String|**TODO: Add Description**|
|resourceGroupId|String|**TODO: Add Description**|
|virtualNetworkId|String|**TODO: Add Description**|
|subNetId|String|**TODO: Add Description**|
|healthCheckStatus|cloudPcOnPremisesConnectionStatus|**TODO: Add Description**. Possible values are: `Pending`, `Running`, `Passed`, `Failed`, `UnknownFutureValue`.|
|healthCheckStatusDetails|[cloudPcOnPremisesConnectionStatusDetails](../resources/cloudpconpremisesconnectionstatusdetails.md)|**TODO: Add Description**|
|inUse|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [AzureConnection](../resources/azureconnection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_azureconnection_from_azureconnections"
}
-->
``` http
POST https://graph.microsoft.com/beta/azureConnections
Content-Type: application/json
Content-length: 544

{
  "@odata.type": "#microsoft.graph.AzureConnection",
  "displayName": "String",
  "subscriptionId": "String",
  "subscriptionName": "String",
  "adDomainName": "String",
  "adDomainUsername": "String",
  "adDomainPassword": "String",
  "organizationalUnit": "String",
  "resourceGroupId": "String",
  "virtualNetworkId": "String",
  "subNetId": "String",
  "healthCheckStatus": "String",
  "healthCheckStatusDetails": {
    "@odata.type": "microsoft.graph.cloudPcOnPremisesConnectionStatusDetails"
  },
  "inUse": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.AzureConnection"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.AzureConnection",
  "id": "ef3be8bc-e8bc-ef3b-bce8-3befbce83bef",
  "displayName": "String",
  "subscriptionId": "String",
  "subscriptionName": "String",
  "adDomainName": "String",
  "adDomainUsername": "String",
  "adDomainPassword": "String",
  "organizationalUnit": "String",
  "resourceGroupId": "String",
  "virtualNetworkId": "String",
  "subNetId": "String",
  "healthCheckStatus": "String",
  "healthCheckStatusDetails": {
    "@odata.type": "microsoft.graph.cloudPcOnPremisesConnectionStatusDetails"
  },
  "inUse": "Boolean"
}
```

