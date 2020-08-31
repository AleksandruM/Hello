/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_recursive_factorial.c                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/19 19:48:01 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/20 18:34:46 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

int	ft_recursive_factorial(int nb)
{
	int	res;

	res = 1;
	if (nb < 0)
		return (0);
	if (nb == 0 || nb == 1)
		return (1);
	nb = (nb * ft_recursive_factorial(nb - 1));
	return (nb);
}

#include<stdio.h>
int main()
{

printf("  %d \n", ft_recursive_factorial(12));
}
