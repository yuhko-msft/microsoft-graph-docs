---
title: "List servicePrincipal"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List servicePrincipal

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the servicePrincipal objects and their properties.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 Ok` response code and a servicePrincipal object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_serviceprincipal"
}
-->

```http
GET https://graph.microsoft.com/beta/servicePrincipals/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.servicePrincipal"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.servicePrincipal",
  "accountEnabled": "Boolean",
  "addIns": [
    {
      "@odata.type": "#microsoft.graph.addIn",
      "id": "String(identifier)",
      "properties": [
        {
          "@odata.type": "#microsoft.graph.keyValue",
          "key": "String",
          "value": "String"
        }
      ],
      "type": "String"
    }
  ],
  "alternativeNames": [
    "String"
  ],
  "api": {
    "@odata.type": "#microsoft.graph.apiServicePrincipal",
    "resourceSpecificApplicationPermissions": [
      {
        "@odata.type": "#microsoft.graph.resourceSpecificPermission",
        "description": "String",
        "displayName": "String",
        "id": "String(identifier)",
        "isEnabled": "Boolean",
        "value": "String"
      }
    ]
  },
  "appDescription": "String",
  "appDisplayName": "String",
  "appId": "String",
  "appOwnerOrganizationId": "Guid",
  "appRoleAssignmentRequired": "Boolean",
  "appRoles": [
    {
      "@odata.type": "#microsoft.graph.appRole",
      "allowedMemberTypes": [
        "String"
      ],
      "description": "String",
      "displayName": "String",
      "id": "String(identifier)",
      "isEnabled": "Boolean",
      "origin": "String",
      "value": "String"
    }
  ],
  "applicationTemplateId": "String",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "errorUrl": "String",
  "hasPermissionClassifications": "Boolean",
  "homepage": "String",
  "id": "String(identifier)",
  "info": {
    "@odata.type": "#microsoft.graph.informationalUrl",
    "logoUrl": "String",
    "marketingUrl": "String",
    "privacyStatementUrl": "String",
    "supportUrl": "String",
    "termsOfServiceUrl": "String"
  },
  "keyCredentials": [
    {
      "@odata.type": "#microsoft.graph.keyCredential",
      "customKeyIdentifier": "Binary",
      "displayName": "String",
      "endDateTime": "DateTimeOffset",
      "key": "Binary",
      "keyId": "Guid",
      "startDateTime": "DateTimeOffset",
      "type": "String",
      "usage": "String"
    }
  ],
  "loginUrl": "String",
  "logoutUrl": "String",
  "notes": "String",
  "notificationEmailAddresses": [
    "String"
  ],
  "passwordCredentials": [
    {
      "@odata.type": "#microsoft.graph.passwordCredential",
      "customKeyIdentifier": "Binary",
      "displayName": "String",
      "endDateTime": "DateTimeOffset",
      "hint": "String",
      "keyId": "Guid",
      "secretText": "String",
      "startDateTime": "DateTimeOffset"
    }
  ],
  "preferredSingleSignOnMode": "String",
  "preferredTokenSigningKeyEndDateTime": "DateTimeOffset",
  "preferredTokenSigningKeyThumbprint": "String",
  "publishedPermissionScopes": [
    {
      "@odata.type": "#microsoft.graph.permissionScope",
      "adminConsentDescription": "String",
      "adminConsentDisplayName": "String",
      "id": "String(identifier)",
      "isEnabled": "Boolean",
      "origin": "String",
      "type": "String",
      "userConsentDescription": "String",
      "userConsentDisplayName": "String",
      "value": "String"
    }
  ],
  "publisherName": "String",
  "replyUrls": [
    "String"
  ],
  "samlMetadataUrl": "String",
  "samlSingleSignOnSettings": {
    "@odata.type": "#microsoft.graph.samlSingleSignOnSettings",
    "relayState": "String"
  },
  "servicePrincipalNames": [
    "String"
  ],
  "servicePrincipalType": "String",
  "signInAudience": "String",
  "tags": [
    "String"
  ],
  "tokenEncryptionKeyId": "Guid"
}
}

```
