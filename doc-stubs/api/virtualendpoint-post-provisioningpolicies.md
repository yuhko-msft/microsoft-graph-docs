---
title: "Create cloudPcProvisioningPolicy"
description: "Create a new cloudPcProvisioningPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create cloudPcProvisioningPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) object.

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
POST /deviceManagement/virtualEndpoint/provisioningPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) object.

You can specify the following properties when creating a **cloudPcProvisioningPolicy**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|onPremisesConnectionId|String|**TODO: Add Description** Optional.|
|imageId|String|**TODO: Add Description** Optional.|
|imageDisplayName|String|**TODO: Add Description** Optional.|
|imageType|cloudPcProvisioningPolicyImageType|**TODO: Add Description**. The possible values are: `gallery`, `custom`. Required.|
|microsoftManagedDesktop|[microsoftManagedDesktop](../resources/microsoftmanageddesktop.md)|**TODO: Add Description** Optional.|
|domainJoinConfiguration|[cloudPcDomainJoinConfiguration](../resources/cloudpcdomainjoinconfiguration.md)|**TODO: Add Description** Optional.|
|windowsSettings|[cloudPcWindowsSettings](../resources/cloudpcwindowssettings.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_cloudpcprovisioningpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/virtualEndpoint/provisioningPolicies
Content-Type: application/json
Content-length: 543

{
  "@odata.type": "#microsoft.graph.cloudPcProvisioningPolicy",
  "displayName": "String",
  "description": "String",
  "onPremisesConnectionId": "String",
  "imageId": "String",
  "imageDisplayName": "String",
  "imageType": "String",
  "microsoftManagedDesktop": {
    "@odata.type": "microsoft.graph.microsoftManagedDesktop"
  },
  "domainJoinConfiguration": {
    "@odata.type": "microsoft.graph.cloudPcDomainJoinConfiguration"
  },
  "windowsSettings": {
    "@odata.type": "microsoft.graph.cloudPcWindowsSettings"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.cloudPcProvisioningPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.cloudPcProvisioningPolicy",
  "id": "dface9c9-e9c9-dfac-c9e9-acdfc9e9acdf",
  "displayName": "String",
  "description": "String",
  "onPremisesConnectionId": "String",
  "imageId": "String",
  "imageDisplayName": "String",
  "imageType": "String",
  "microsoftManagedDesktop": {
    "@odata.type": "microsoft.graph.microsoftManagedDesktop"
  },
  "domainJoinConfiguration": {
    "@odata.type": "microsoft.graph.cloudPcDomainJoinConfiguration"
  },
  "windowsSettings": {
    "@odata.type": "microsoft.graph.cloudPcWindowsSettings"
  }
}
```

