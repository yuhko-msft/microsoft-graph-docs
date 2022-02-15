---
title: "Update managementTemplateStepDeployment"
description: "Update the properties of a managementTemplateStepDeployment object."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: apiPageType
---

# Update managementTemplateStepDeployment
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|ManagedTenants.Read.All, ManagedTenants.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}/deployments/{managementTemplateStepDeploymentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|tenantId|String|**TODO: Add Description** Required.|
|status|managementTemplateDeploymentStatus|**TODO: Add Description**. The possible values are: `unknown`, `inProgress`, `completed`, `failed`, `ineligible`, `unknownFutureValue`. Required.|
|error|[microsoft.graph.managedTenants.graphAPIErrorDetails](../resources/managedtenants-graphapierrordetails.md)|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdByUserId|String|**TODO: Add Description** Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastActionByUserId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_managementtemplatestepdeployment"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateSteps/{managementTemplateStepId}/versions/{managementTemplateStepVersionId}/deployments/{managementTemplateStepDeploymentId}
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepDeployment",
  "tenantId": "String",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.managedTenants.graphAPIErrorDetails"
  },
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepDeployment",
  "id": "30dd4e3e-67e0-07e1-d197-18f4684c354d",
  "tenantId": "String",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.managedTenants.graphAPIErrorDetails"
  },
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```

